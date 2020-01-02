package com.hospital.purchase.mapper;

import com.hospital.purchase.domain.DrugInformationSheet;

public interface DrugInformationSheetMapper {
    int deleteByPrimaryKey(Integer drugId);

    int insert(DrugInformationSheet record);

    int insertSelective(DrugInformationSheet record);

    DrugInformationSheet selectByPrimaryKey(Integer drugId);

    int updateByPrimaryKeySelective(DrugInformationSheet record);

    int updateByPrimaryKey(DrugInformationSheet record);
}