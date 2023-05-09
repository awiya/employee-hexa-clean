package io.awiya.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Assembler<M, D> {


    D assemble(M model);

    void mergeDtoIntoModel(D sourceDto, M targetModel);

    void assembleModelIntoDto(M sourceModel, D targetDto);

    default List<D> assemble(Iterable<M> models) {
        ArrayList<D> list = new ArrayList<>();
        for (M model : models) {
            list.add(assemble(model));
        }
        return list;
    }

}

