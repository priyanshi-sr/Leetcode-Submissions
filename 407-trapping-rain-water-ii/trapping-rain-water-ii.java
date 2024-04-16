class Solution {
    public int trapRainWater(int[][] heightMap) {
        int trappedWater = 0;
        int[][] waterLevelMap = new int[heightMap.length][heightMap[0].length];

        for (int i = 1; i < heightMap.length-1; i++) {
            waterLevelMap[i][0] = heightMap[i][0];
            for (int j = 1; j < heightMap[i].length-1; j++) {
                waterLevelMap[i][j] = 20_000;
            }
            waterLevelMap[i][heightMap[i].length-1] = heightMap[i][heightMap[i].length-1];
        }
        for (int i = 0; i < heightMap[0].length; i++) {
            waterLevelMap[0][i] = heightMap[0][i];
            waterLevelMap[heightMap.length-1][i] = heightMap[heightMap.length-1][i];
        }

        boolean drain = true;
        while (drain) {
            drain = false;
            for (int i = 1; i < heightMap[0].length-1; i++) {
                for (int j = 1; j < heightMap.length-1; j++) {
                    if (waterLevelMap[j][i] > heightMap[j][i]) {
                        if (waterLevelMap[j][i] > waterLevelMap[j][i-1])
                            waterLevelMap[j][i] = Integer.max(waterLevelMap[j][i-1], heightMap[j][i]);
                        if (waterLevelMap[j][i] > waterLevelMap[j-1][i])
                            waterLevelMap[j][i] = Integer.max(waterLevelMap[j-1][i], heightMap[j][i]);
                    }
                }
            }
            for (int i = heightMap[0].length-2; i > 0; i--) {
                for (int j = heightMap.length-2; j > 0; j--) {
                    if (waterLevelMap[j][i] > heightMap[j][i]) {
                        if (waterLevelMap[j][i] > waterLevelMap[j][i+1])
                            waterLevelMap[j][i] = Integer.max(waterLevelMap[j][i+1], heightMap[j][i]);
                        if (waterLevelMap[j][i] > waterLevelMap[j+1][i])
                            waterLevelMap[j][i] = Integer.max(waterLevelMap[j+1][i], heightMap[j][i]);
                        if (waterLevelMap[j][i] < waterLevelMap[j][i+1] && waterLevelMap[j][i+1] > heightMap[j][i+1]
                            || waterLevelMap[j][i] < waterLevelMap[j+1][i] && waterLevelMap[j+1][i] > heightMap[j+1][i])
                            drain = true;
                    }
                }
            }
        }

        for (int i = 1; i < waterLevelMap.length-1; i++) {
            for (int j = 1; j < waterLevelMap[i].length-1; j++) {
                trappedWater += waterLevelMap[i][j] - heightMap[i][j];
            }
        }

        return trappedWater;
    }
}