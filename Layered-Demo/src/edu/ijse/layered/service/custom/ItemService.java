/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.ItemDto;
import java.util.ArrayList;
import edu.ijse.layered.service.SuperService;

/**
 *
 * @author ASUS
 */
public interface ItemService extends SuperService {
    public String save(ItemDto itemDto) throws Exception;
    public String update(ItemDto itemDto) throws Exception;
    public String delete(String itemCode) throws Exception;
    public ItemDto search(String itemCode) throws Exception;
    public ArrayList<ItemDto> getAll() throws Exception;
}
