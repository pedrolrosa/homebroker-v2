/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.repositories;

/**
 *
 * @author silva.junior
 */
public interface AssetRepository {
    
    boolean updateAmount(Long id, Integer quantity);
    
}
