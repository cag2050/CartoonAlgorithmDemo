package chapter5.part11;

public class GoldMining {
    /**
     * 获得金矿最优收益
     *
     * @param w 工人总数量 worker
     * @param p 金矿开采所需工人数量 people
     * @param g 金矿储量 gold
     */
    private static int getBestGoldMiningV2(int w, int[] p, int[] g) {
        //创建表格
        int[][] resultTable = new int[g.length + 1][w + 1];
        //填充表格
        for (int i = 1; i <= g.length; i++) {
            for (int j = 1; j <= w; j++) {
                if (j < p[i - 1]) {
                    resultTable[i][j] = resultTable[i - 1][j];
                } else {
                    resultTable[i][j] = Math.max(resultTable[i - 1][j], resultTable[i - 1][j - p[i - 1]] + g[i - 1]);
                }
            }
        }-
        //返回最后一个格子的值
        return resultTable[g.length][w];
    }

    public static void main(String[] args) {
        //工人总数量
        int w = 10;
        //金矿开采所需工人数量
        int[] p = {5, 5, 3, 4, 3};
        //金矿储量
        int[] g = {400, 500, 200, 300, 350};
        System.out.println("最优收益：" + getBestGoldMiningV2(w, p, g));
    }
}
