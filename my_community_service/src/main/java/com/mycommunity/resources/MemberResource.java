package com.mycommunity.resources;

import com.codahale.metrics.annotation.Metric;
import com.codahale.metrics.annotation.Timed;
import com.mycommunity.models.CommunityMember;
import com.mycommunity.resources.MemberResource;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/communityMember")
@Produces(MediaType.APPLICATION_JSON)
public class MemberResource {

    @POST
    @Timed
    @Metric
    public void createMember(CommunityMember member) {

    }

    @PUT
    @Timed
    @Metric
    public void updateMember(CommunityMember member) {

    }

    @DELETE
    @Timed
    @Metric
    @Path("/{id}")
    public void deleteMember(@PathParam("id") final String memberId) {

    }
}
