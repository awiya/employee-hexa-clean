package io.awiya.mapper;

import com.fasterxml.classmate.GenericType;
import org.springframework.core.GenericTypeResolver;

import java.lang.reflect.InvocationTargetException;

public abstract class BaseAssembler<M, D> implements Assembler<M, D> {

    private Class<D> dtoClass;

    protected BaseAssembler() {
        Class<?>[] types = GenericTypeResolver.resolveTypeArguments(getClass(), Assembler.class);
        if (types == null) {
            throw new IllegalStateException("Invalid Assembler class: " + getClass().getName() + ", Could not unfair parametrized types");
        }
        dtoClass = (Class<D>) types[1];
    }


    @Override
    final public D assemble(M model) {
        D dto = createDto(model);
        assembleModelIntoDto(model, dto);
        return dto;
    }

    @Override
    public void mergeDtoIntoModel(D sourceDto, M targetModel) {
        doMergeDtoIntoModel(sourceDto, targetModel);
    }

    @Override
    public void assembleModelIntoDto(M sourceModel, D targetDto) {
        doAssembleModelIntoDto(sourceModel,targetDto);
    }

    protected D createDto(M model) {
        try {
            return dtoClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            return null;
        }
    }
    protected abstract void doMergeDtoIntoModel(D sourceDto, M targetModel);
    protected abstract void doAssembleModelIntoDto(M sourceModel, D targetDto);
}
