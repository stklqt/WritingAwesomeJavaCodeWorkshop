package de.stevenschwenke.java.writingawesomejavacodeworkshop.part2MethodsForLegacyCode.adrianbolboaca.ep_2_golden_master;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

/**
 * These are the resulting tests from Adrian Bolboacas great Code Cast, see
 * http://blog.adrianbolboaca.ro/2014/05/golden-master-code-cast/.
 */
public class GameTestsEpisode2 {

    @Ignore("Ignored because this should only be called once to create Golden Master data.")
    @Test
    public void generateGoldenMasters() throws IOException {
        GoldenMaster goldenMaster = new GoldenMaster();
        goldenMaster.generateGoldenMaster();
    }

    @Test
    public void checkTriviaAgainstGoldenMaster() throws IOException {
        GoldenMaster goldenMaster = new GoldenMaster();

        for (long seed = 0; seed < GoldenMaster.SAMPLESIZE; seed++) {
            String expected = goldenMaster.getGoldenMaster(seed);
            String actual = goldenMaster.getGameResult(seed);
            assertEquals(expected, actual);
        }
    }
}
