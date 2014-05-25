/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.mengmeng.fm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 * @author derrick.tangp May 25, 2014 4:25:16 PM
 */
@Component
@Path("/weather")
@Scope("request")
public class Weather {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/getCityList")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCityList() {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }
}
