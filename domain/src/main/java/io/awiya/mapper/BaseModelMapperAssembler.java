package io.awiya.mapper;

import org.modelmapper.ModelMapper;

public class BaseModelMapperAssembler<M, D> extends BaseAssembler<M, D> implements Assembler<M, D>{

    final ModelMapper assemblingMapper;
    final ModelMapper mergingMapper;

    @SuppressWarnings("unchecked")
    protected BaseModelMapperAssembler() {
        super();
        this.assemblingMapper = new ModelMapper();
        this.mergingMapper = new ModelMapper();

    }

    @Override
    protected void doMergeDtoIntoModel(Object sourceDto, Object targetModel) {
        mergingMapper.map(sourceDto, targetModel);
    }

    @Override
    protected void doAssembleModelIntoDto(Object sourceModel, Object targetDto) {
        assemblingMapper.map(sourceModel, targetDto);
    }
}
