package com.mycommunity.services.impl;

import com.mycommunity.services.MemberService;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/communityMember")
@Produces(MediaType.APPLICATION_JSON)
public class MemberServiceImpl {
    private MemberService memberService = new MemberServiceImpl();
}
