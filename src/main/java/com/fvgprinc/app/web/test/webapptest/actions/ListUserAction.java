/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.test.webapptest.actions;

import com.fvgprinc.app.web.test.webapptest.dao.DisplayDao;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/")
@Action(value = "listuseraction", results = {
    @Result(name = SUCCESS, location = "/listdata.jsp")})

public class ListUserAction extends ActionSupport {
    // private static final long serialVersionUID = -7591893545033222898L;

    private ListUserAction dto = null;
    private String nombre;
    private String apellido;
    private String correo;

    private List<ListUserAction> usuarioList = null;

    @Override
    public String execute() throws Exception {
        ResultSet rs = DisplayDao.Report();
        usuarioList = new ArrayList<ListUserAction>();

        if (rs != null) {
            while (rs.next()) {
                dto = new ListUserAction();
                dto.setNombre(rs.getString(1));
                dto.setApellido(rs.getString(2));
                dto.setCorreo(rs.getString(3));
                usuarioList.add(dto);
            }
        }

        return SUCCESS;
    }

    public List<ListUserAction> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<ListUserAction> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
