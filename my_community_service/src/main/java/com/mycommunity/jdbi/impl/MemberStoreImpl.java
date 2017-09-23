package com.mycommunity.jdbi.impl;

import com.mycommunity.jdbi.MemberStore;
import com.mycommunity.models.CommunityMember;
import org.mongodb.morphia.Morphia;

public class MemberStoreImpl implements MemberStore {
    protected MemberStoreImpl() {
        final Morphia morphia = new Morphia();
    }

    @Override
    public void create(CommunityMember member) {

    }

    @Override
    public CommunityMember update(CommunityMember member) {
        return null;
    }

    @Override
    public void delete(CommunityMember member) {

    }
}
