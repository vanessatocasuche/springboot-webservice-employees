package com.udea.persona.dao;

import org.springframework.data.repository.CrudRepository;

import com.udea.persona.model.Empleado;

/**
 * IEmpleadoDAO
 * @author Vanessa
 */
public interface IEmpleadoDAO extends CrudRepository<Empleado, Long> {

}
