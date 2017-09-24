package com.mycommunity.models;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;

import java.util.UUID;

@Entity("communityMembers")
public class CommunityMember {
    @Indexed
    private final String memberId;

    public CommunityMember() {
        memberId = UUID.randomUUID().toString();
    }

    public String getMemberId() {
        return memberId;
    }
}
