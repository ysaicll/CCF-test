/*
问题描述
　　小Q和小M是游戏数值策划师，他们最近在测试自己新设计的卡牌对战游戏。游戏总共有 n 张卡牌，用 1 到 n 的正整数编号。最开始小Q和小M各会拥有其中的一部分。
　　每一局游戏，小Q和小M都需要从自己拥有的卡牌中选出一张进行对战，获胜的一方会获得双方选出的两张卡牌。游戏会一直进行下去，直到其中一个人获得了所有的卡牌，此时获得所有卡牌的一方赢得了最终的胜利。
　　对于一对特定的卡牌 i 和 j，i 战胜 j 的概率为 Pi, j。此概率与其他事件独立，只与选出的这两张卡牌有关系；每次对战一定会决出胜负，因此有 Pi,j + Pj,i = 1。
　　小Q和小M都没有好好学习博弈论，已经忘了混合决策那套理论。经过商量，他们采取了同一套看起来合理的选牌方式：
　　1. 对于自己的卡牌 i，计算出这张卡牌能赢得对方每张卡牌的概率之和 Si=∑j是对方的卡牌Pi, j ；
　　2. 令自己选出卡牌i的概率正比于Si，即选出i的概率为 Si/∑k是自己的卡牌Sk。
　　小M想知道，对于给出的 m 种初始状态，他最终获胜的概率是多少。
输入格式
　　从标准输入读入数据。
　　输入的第一行包含两个正整数 n, m 表示卡牌的数量和初始状态的数量。
　　接下来 n-1 行。其中的第 i 行（1 ≤ i < n）包含 n - i 个恰好含有 2 位小数的浮点数；该行的第 j 个（1 ≤ j ≤ n - i）数表示 Pi, i+j。
　　保证上述每个 Pi,j 均是直接调用伪随机数生成函数生成一个 [10, 90] 上的整数，然后除以 100 得到；即可以认为每个数都是从 [0.10, 0.90] 上的所有 2 位小数中，独立等概率取得的。
　　接下来 m 行，每行包含 n 个 0 或 1 的整数，描述一个初始状态。这 n 个数中的第 i 个如果是 1 表示第 i 张牌最初在小M手中，否则表示这张牌在小Q手中。
　　保证询问两两不同。
输出格式
　　输出到标准输出。
　　输出 m 行，每行输出一个小数部分长度恰好为5的浮点数，表示小M的每种初始状况最终获胜的概率四舍五入后的结果。
　　你答案中的每个数必须和参考答案完全一样才能获得相应测试点的分数。
　　保证参考答案与真实答案的差值不超过 4 × 10-6。
样例输入
3 4
0.46 0.21
0.86
0 0 0
1 1 0
0 0 1
1 1 1
样例输出
0.00000
0.83488
0.16512
1.00000
样例说明
局面编号
小M的牌
小Q的牌
S1
S2
S3
小M的
Si 之和
小Q的
Si 之和
x1
1
2,3
0.67
0.54
0.79
0.67
1.33
x2
2
1,3
0.46
1.40
0.14
1.40
0.60
x3
3
1,2
0.21
0.86
0.93
0.93
1.07
　　我们设 P (x) 为当前局面为 x，最终小M获胜的概率，例如 P (x1) 表示小M手里的牌为 1 最终获胜的概率。
　　定义事件 ^x 为将局面 x 中双方手里的牌互换的局面，根据对称性易得 P( ^x)=1 - P (x)。
　　对于全部牌都在小M手里的情况，小M已经赢得了胜利，此种情况下小M获胜概率为 1；相反，牌全部在小Q手里的话，小M获胜概率为 0。
　　对于局面 x1：小M由于只有一张牌 1，因此他必须出这张牌；小Q根据之前的选牌策略，他有 0.54/1.33 的概率出 2，有 0.79/1.33 的概率出 3。若小Q出 2：则小M有 0.46 的概率会赢得这张牌，从而进入局面 ^x3；有 1-0.46 的概率会输掉手中最后一张 1。若小Q出 3：则小M有 0.21 的概率会赢得这张牌，从而进入局面 ^x2；有 1-0.21 的概率会输掉最后一张 1。因此，可以得出



　　同理，可以求出 P (x2) 和 P (x3) 的表达式：



　　注意到 0.2484/1.33， 0.1204/0.60 等数均小于 1，我们可以将三个式子互相不断代入各自的等式右边，得到一个收敛的级数。对这个级数求和就能求出样例的答案。
样例输入
2 4
0.34
0 0
1 0
0 1
1 1
样例输出
0.00000
0.34000
0.66000
1.00000
样例输入
4 8
0.81 0.34 0.73
0.85 0.50
0.22
0 0 0 0
1 0 1 0
0 1 1 0
1 1 1 0
0 0 0 1
1 0 0 1
0 1 0 1
1 1 1 1
样例输出
0.00000
0.61095
0.38546
0.80232
0.19768
0.61454
0.38905
1.00000
样例输入
5 20
0.45 0.28 0.48 0.59
0.61 0.88 0.66
0.19 0.67
0.11
0 0 0 0 0
1 0 0 0 0
0 1 0 0 0
0 0 1 0 0
1 0 1 0 0
1 0 0 1 0
1 1 0 1 0
0 0 1 1 0
1 0 1 1 0
1 1 1 1 0
0 0 0 0 1
0 1 0 0 1
1 1 0 0 1
0 0 1 0 1
0 1 1 0 1
0 1 0 1 1
1 1 0 1 1
1 0 1 1 1
0 1 1 1 1
1 1 1 1 1
样例输出
0.00000
0.15693
0.30992
0.16074
0.35568
0.28030
0.63788
0.31579
0.52478
0.85575
0.14425
0.47522
0.68421
0.36212
0.71970
0.64432
0.83926
0.69008
0.84307
1.00000
评测用例规模与约定
　　总共 20 组评测数据。对于第 i 组数据（1 ≤ i ≤ 20）：若 i ≤ 10，n=?i / 2?；若 i > 10，n = i-5。
*/
//通过率80%

