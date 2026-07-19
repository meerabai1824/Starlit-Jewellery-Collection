package com.jewellery.dao;

import java.util.List;

import com.jewellery.dto.JewelleryDTO;

public interface JewelleryDAO {

    boolean addJewellery(JewelleryDTO jewellery);

    boolean updateJewellery(JewelleryDTO jewellery);

    boolean deleteJewellery(int jewelleryId);

    JewelleryDTO getJewelleryById(int jewelleryId);

    List<JewelleryDTO> getAllJewellery();

}