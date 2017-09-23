package com.mycommunity.jdbi;

import com.mycommunity.models.CommunityMember;

public interface MemberStore {
    void create(final CommunityMember member);

    CommunityMember update(final CommunityMember member);

    void delete(CommunityMember member);
}
