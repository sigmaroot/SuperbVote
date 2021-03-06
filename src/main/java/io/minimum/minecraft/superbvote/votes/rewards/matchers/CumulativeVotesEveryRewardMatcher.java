package io.minimum.minecraft.superbvote.votes.rewards.matchers;

import io.minimum.minecraft.superbvote.util.PlayerVotes;
import io.minimum.minecraft.superbvote.votes.Vote;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CumulativeVotesEveryRewardMatcher implements RewardMatcher {
    private final int everyVotes;

    @Override
    public boolean matches(Vote vote, PlayerVotes pv) {
        int cur = pv.getType() == PlayerVotes.Type.FUTURE ? pv.getVotes() : pv.getVotes() + 1;
        return cur % everyVotes == 0;
    }
}
