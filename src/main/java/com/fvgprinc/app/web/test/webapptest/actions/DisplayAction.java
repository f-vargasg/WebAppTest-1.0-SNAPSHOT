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
@Action(value = "displayaction", results = {
    @Result(name = SUCCESS, location = "/listdata.jsp")})

public class DisplayAction extends ActionSupport {
    // private static final long serialVersionUID = -7591893545033222898L;

    private DisplayAction dto = null;
    private String nombre;
    private String apellido;
    private String correo;

    private List<DisplayAction> usuarioList = null;

    public String execute() throws Exception {
        ResultSet rs = DisplayDao.Report();
        usuarioList = new ArrayList<DisplayAction>();

        if (rs != null) {
            while (rs.next()) {
                dto = new DisplayAction();
                dto.setNombre(rs.getString(1));
                dto.setApellido(rs.getString(2));
                dto.setCorreo(rs.getString(3));
                usuarioList.add(dto);
            }
        }

        return SUCCESS;
    }

    public List<DisplayAction> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<DisplayAction> usuarioList) {
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
