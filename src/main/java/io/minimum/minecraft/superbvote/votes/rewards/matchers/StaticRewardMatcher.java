package io.minimum.minecraft.superbvote.votes.rewards.matchers;

import io.minimum.minecraft.superbvote.util.PlayerVotes;
import io.minimum.minecraft.superbvote.votes.Vote;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class StaticRewardMatcher implements RewardMatcher {
    public static final StaticRewardMatcher ALWAYS_MATCH = new StaticRewardMatcher(true);
    public static final StaticRewardMatcher NEVER_MATCH = new StaticRewardMatcher(false);

    private final boolean val;

    @Override
    public boolean matches(Vote vote, PlayerVotes pv) {
        return val;
    }
}
