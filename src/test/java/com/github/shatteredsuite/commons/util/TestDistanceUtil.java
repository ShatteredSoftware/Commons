package com.github.shatteredsuite.commons.util;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;

import com.github.shatteredsuite.commons.util.DistanceUtil;
import org.junit.jupiter.api.Test;

public class TestDistanceUtil {
    @Test
    public void testInt2DCoordinates() {
        assertThat(DistanceUtil.distance2D(0, 4, 3, 0), equalTo(5));
    }

    @Test
    public void testFloat2DCoordinates() {
        assertThat((double) DistanceUtil.distance2D(0f, 5f, -5f, 0f), closeTo(7.071f, 0.001f));
    }

    @Test
    public void testDouble2DCoordinates() {
        assertThat(DistanceUtil.distance2D(0d, 14d, -5d, 0d), closeTo(14.866f, 0.001f));
    }

    @Test
    public void testLong2DCoordinates() {
        assertThat(DistanceUtil.distance2D(0L, 14L, -5L, 0L), equalTo(15L));
    }

    @Test
    public void testLong3DCoordinates() {
        assertThat(DistanceUtil.distance3D(0L, 14L, -6L, -5L, 0L, 0L), equalTo(16L));
    }

    @Test
    public void testInt3DCoordinates() {
        assertThat(DistanceUtil.distance3D(7, 4, 3, 17, 6, 2), equalTo(10));
    }

    @Test
    public void testDouble3DCoordinates() {
        assertThat(DistanceUtil.distance3D(7, 4, 3, 17, 6, 2d), closeTo(10.246, 0.001));
    }

    @Test
    public void testFloat3DCoordinates() {
        assertThat((double) DistanceUtil.distance3D(1f, 14f, -6f, 0f, -5f, 0f), closeTo(19.949d, 0.001));
    }
}
