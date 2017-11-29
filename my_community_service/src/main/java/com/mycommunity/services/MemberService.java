package com.mycommunity.services;

import com.mycommunity.models.CommunityMember;

public interface MemberService {
    void addMember(final CommunityMember member);

    void updateMember(final CommunityMember member);

    void deleteMember(final String memberId);
}
