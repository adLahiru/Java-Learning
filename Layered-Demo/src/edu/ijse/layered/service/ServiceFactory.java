/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service;

import edu.ijse.layered.service.custom.ItemService;
import edu.ijse.layered.service.custom.impl.ItemServiceImpl;

/**
 *
 * @author ASUS
 */
//singleton class
public class ServiceFactory {
    public static ServiceFactory serviceFactory;

    public ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case ITEM:
                return new ItemServiceImpl();
            case ORDER:
                return null;
            case CUSTOMER:
                return null;
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ITEM ,ORDER ,CUSTOMER
    }
    
}
