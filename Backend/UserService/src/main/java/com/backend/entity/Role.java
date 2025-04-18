package com.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String roleName;

    public Role() {}

    public Role(Long roleId) 
    {
        this.roleId = roleId;
        
    }

    public Long getRoleId()
    { 
    	return roleId; 
    }
    public void setRoleId(Long roleId)
    { 
    	this.roleId = roleId; 
    	
    }

    public String getRoleName() { return roleName; }
    public void setRoleName(String name) { this.roleName = name; }
}
