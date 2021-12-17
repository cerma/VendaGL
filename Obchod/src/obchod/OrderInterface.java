/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package obchod;

import java.util.ArrayList;

/**
 *
 * @author cermak
 */
public interface OrderInterface {
       int getNumber();

    /**
     * Customer's first name
     */
    String getFirstName();

    /**
     * Customer's last name
     */
    String getLastName();

    /**
     * Street
     */
    String getStreet();

    /**
     * House number
     */
    int getHouseNumber();

    /**
     * Registry number
     */
    int getRegistryNumber();

    /**
     * City
     */
    String getCity();

    /**
     * Zip code
     */
    String getZipCode();

    /**
     * Country
     */
    String getCountry();

    /**
     * Product names
     */
    ArrayList<String> getProducts();

    /**
     * Product quantities
     */
    ArrayList<Integer> getProductQuantities();

    /**
     * Product prices
     */
    ArrayList<Double> getProductPrices();
    
}
