package com.mycommunity.jdbi.impl;

import com.mongodb.Mongo;
import com.mycommunity.jdbi.MemberStore;
import com.mycommunity.models.CommunityMember;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class MemberStoreImpl implements MemberStore {
    private Datastore datastore;

    protected MemberStoreImpl() throws Exception {
        final Morphia morphia = new Morphia();
        datastore = morphia.map(CommunityMember.class).createDatastore(new Mongo(), "memberStore");
    }

    @Override
    public void create(final CommunityMember member) {
        datastore.save(member);
    }

    @Override
    public void update(final CommunityMember member) {
        return;
    }

    @Override
    public void delete(final CommunityMember member) {

    }
}
