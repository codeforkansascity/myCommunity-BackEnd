package com.mycommunity.jdbi;

import com.mycommunity.models.CommunityMember;

public interface MemberStore {
    void create(final CommunityMember member);

    void update(final CommunityMember member);

    void delete(final CommunityMember member);
}
