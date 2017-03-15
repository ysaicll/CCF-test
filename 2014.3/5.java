/*
问题描述

　　有若干个任务需要在一台机器上运行。它们之间没有依赖关系,因此 可以被按照任意顺序执行。
 　　该机器有两个 CPU 和一个 GPU。对于每个任务,你可以为它分配不 同的硬件资源:
　　1. 在单个 CPU 上运行。
 　　2. 在两个 CPU 上同时运行。
 　　3. 在单个 CPU 和 GPU 上同时运行。
 　　4. 在两个 CPU 和 GPU 上同时运行。
 　　一个任务开始执行以后,将会独占它所用到的所有硬件资源,不得中 断,直到执行结束为止。第 i 个任务用单个 CPU,两个 CPU,单个 CPU 加 GPU,两个 CPU 加 GPU 运行所消耗的时间分别为 ai,bi,ci 和 di。
 　　现在需要你计算出至少需要花多少时间可以把所有给定的任务完成。

输入格式

　　输入的第一行只有一个正整数 n(1 ≤ n ≤ 40), 是总共需要执行的任 务个数。
 　　接下来的 n 行每行有四个正整数 ai, bi, ci, di(ai, bi, ci, di 均不超过 10), 以空格隔开。

输出格式

　　输出只有一个整数,即完成给定的所有任务所需的最少时间。

样例输入

3
 4 4 2 2
 7 4 7 4
 3 3 3 3

样例输出

7

样例说明

　　有很多种调度方案可以在 7 个时间单位里完成给定的三个任务,以下是其中的一种方案:
　　同时运行第一个任务(单 CPU 加上 GPU)和第三个任务(单 CPU), 它们分别在时刻 2 和时刻 3 完成。在时刻 3 开始双 CPU 运行任务 2,在 时刻 7 完成。
*/
//通过率100%


