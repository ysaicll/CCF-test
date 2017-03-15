/*
问题描述

　　某校新建的大楼中有n台设备，学校需要利用这些设备搭建一个网络。我们用1到n的整数给这些设备编号。
 　　这些设备之间一共可以建立m条连线，建立每条连线会消耗一定的费用。连接建立后两台设备就可以相互通信了。两台设备可以借助其他设备进行通信，即通信关系可传递：如果设备A和设备B都能与设备C相互通信，那么设备A和设备B也能相互通信。
 　　由于大楼的拓扑结构所限，可以建立连线的两台设备，一定满足其编号之差的绝对值不超过p。
 　　这n台设备中的一部分属于用户设备。学校要求在最终的网络中，用户设备必须两两能够相互通信，其他设备则可以根据需要选择连线或不连线。
 　　现在问要达到学校的要求最少要消耗多少的费用。

输入格式

　　输入的第一行包含一个正整数T，表示数据的组数，保证T=5。接下来依次描述每组数据。
 　　每组数据的第一行包含3个正整数n, m, p，表示设备的总数，可以建立的连线数量和拓扑结构的参数。
 　　第二行包含一个长度为n的01字符串，依次表示这n台设备是否为用户设备；为1表示是，为0表示不是。相邻字符之间无空格隔开，保证不会出现除了0和1之外的字符。保证至少有2个设备是用户设备。
 　　接下来m行，每行包含3个非负整数u, v, w，表示设备u和设备v可以消耗w的费用建立连线。其中0 < u < v ≤ n，v – u ≤ p，w ≤ 106。
 　　除第二行外，所有的数之间用一个空格隔开。
 　　保证两台设备之间最多只有一条可以建立的连线，保证至少存在一种方案能够满足学校的要求。

输出格式

　　对于每组数据，输出一行一个整数，表示能达到要求所需的最少费用。

样例输入

1
 20 11 6
 10000100001100000000
 1 6 300
 1 3 100
 3 6 100
 4 10 100
 4 6 100
 6 10 400
 10 15 100
 11 15 100
 10 11 500
 12 15 100
 15 20 100

样例输出

700

样例说明

　　用户设备分别是1、6、11、12。最优的方案需要选择以下连线：设备1和3，费用100；设备3和6，费用100；设备4和6，费用100；设备4和10，费用100；设备10和15，费用100；设备11和15，费用100；设备12和15，费用100。共计700。

子任务

　　每个测试点的每组数据分别都满足以下限制（其中c表示用户设备总数）：

编号
 n
 p
 c
 
1
 =500
 =6
 =n
 
2
 =500
 =6
 =2
 
3
 =500
 =6
 =4
 
4
 =500
 =6
 =6
 
5
 =500
 =6
 =10
 
6
 =500
 =2
 无限制
 
7
 =500
 =2
 无限制
 
8
 =500
 =3
 无限制
 
9
 =500
 =6
 无限制
 
10
 =500
 =6
 无限制
 

样例输入

5
 20 93 6
 11111111111111111111
 1 2 727765
 2 3 263881
 1 4 514909
 2 4 131844
 3 4 933178
 1 5 438613
 2 5 603733
 3 5 859906
 4 5 38725
 1 6 599082
 2 6 225184
 3 6 365575
 4 6 126126
 5 6 25505
 2 7 546601
 3 7 63931
 4 7 419406
 5 7 531790
 6 7 265271
 2 8 724126
 3 8 163879
 4 8 59317
 5 8 545880
 6 8 126779
 7 8 938859
 4 9 387231
 5 9 600880
 6 9 927742
 7 9 56690
 8 9 987324
 4 10 23106
 5 10 328383
 6 10 757082
 7 10 787341
 8 10 218539
 9 10 282814
 5 11 506005
 6 11 257575
 7 11 524808
 8 11 223439
 9 11 402018
 10 11 580131
 6 12 711292
 7 12 314072
 8 12 752595
 9 12 141042
 10 12 339498
 11 12 321201
 7 13 100337
 8 13 969444
 9 13 683912
 10 13 973527
 11 13 776443
 12 13 436444
 8 14 826460
 9 14 453950
 10 14 231374
 11 14 667343
 13 14 754318
 10 15 46540
 11 15 741941
 12 15 909374
 13 15 901791
 14 15 246817
 10 16 34192
 11 16 866848
 12 16 488324
 13 16 824636
 14 16 319615
 15 16 472537
 11 17 661823
 12 17 595773
 13 17 912773
 14 17 674733
 15 17 880787
 16 17 168668
 12 18 621903
 13 18 894662
 14 18 994829
 15 18 80344
 16 18 343121
 17 18 697098
 13 19 569872
 14 19 599332
 15 19 417377
 16 19 837022
 18 19 270641
 14 20 748579
 15 20 724926
 16 20 367572
 17 20 103857
 18 20 443540
 19 20 932348
 20 92 6
 00000010000000001000
 1 2 113099
 1 3 587351
 2 3 209419
 1 4 412024
 2 4 526550
 3 4 74575
 1 5 627809
 2 5 488889
 3 5 78667
 4 5 853953
 1 6 914999
 2 6 60305
 3 6 52666
 4 6 39394
 5 6 243622
 1 7 843636
 2 7 752452
 3 7 206953
 4 7 209536
 5 7 105503
 6 7 179097
 2 8 938375
 3 8 449664
 4 8 464591
 5 8 312120
 6 8 943383
 7 8 798642
 3 9 759837
 4 9 655902
 5 9 367024
 6 9 560174
 7 9 421235
 8 9 552637
 4 10 251605
 5 10 453809
 6 10 942947
 7 10 378285
 8 10 944748
 9 10 761726
 5 11 7926
 6 11 237034
 8 11 860297
 9 11 224152
 10 11 62671
 7 12 518894
 9 12 265459
 10 12 399585
 11 12 16993
 7 13 935813
 8 13 675125
 9 13 986248
 10 13 801332
 11 13 775825
 12 13 483974
 8 14 879925
 9 14 568657
 10 14 539371
 11 14 392819
 12 14 673171
 13 14 593981
 9 15 893512
 10 15 459005
 11 15 935151
 13 15 984026
 14 15 352506
 10 16 847405
 11 16 902823
 12 16 924659
 14 16 31185
 15 16 83802
 11 17 225697
 12 17 697702
 13 17 431672
 14 17 934227
 15 17 64055
 16 17 714592
 12 18 429691
 13 18 69217
 16 18 916446
 17 18 859123
 13 19 675753
 14 19 427831
 15 19 3386
 16 19 179655
 17 19 148897
 18 19 307554
 14 20 291004
 15 20 497622
 16 20 669001
 17 20 742221
 18 20 662204
 19 20 966218
 20 93 6
 00000101001110000010
 1 2 710445
 1 3 390108
 2 3 871795
 1 4 323940
 2 4 1557
 3 4 853515
 1 5 987497
 2 5 791951
 3 5 565856
 4 5 401932
 1 6 49223
 2 6 59889
 3 6 300678
 4 6 123895
 5 6 160344
 1 7 196308
 3 7 787087
 5 7 224478
 6 7 104395
 3 8 344509
 4 8 173377
 5 8 100930
 7 8 544113
 3 9 475119
 4 9 673881
 5 9 234187
 6 9 191885
 7 9 35559
 8 9 872991
 4 10 339910
 5 10 624600
 6 10 442925
 7 10 821981
 8 10 805172
 9 10 463188
 5 11 745511
 6 11 444346
 7 11 856170
 8 11 10706
 9 11 582739
 10 11 666926
 6 12 838187
 7 12 711050
 8 12 386931
 9 12 886249
 10 12 356669
 11 12 14156
 7 13 339092
 8 13 578454
 9 13 195419
 10 13 600017
 11 13 504670
 12 13 753722
 8 14 219160
 9 14 281523
 10 14 730539
 11 14 890253
 12 14 789909
 13 14 995665
 9 15 227552
 10 15 125146
 11 15 737706
 12 15 697809
 13 15 753633
 14 15 248107
 10 16 15962
 11 16 178154
 12 16 586355
 13 16 32073
 14 16 912542
 15 16 913266
 11 17 158548
 12 17 35601
 14 17 818081
 15 17 39970
 16 17 330500
 12 18 207654
 13 18 729538
 14 18 642935
 15 18 73734
 16 18 676418
 17 18 455930
 13 19 945333
 15 19 723755
 16 19 67978
 17 19 128589
 18 19 647790
 14 20 294150
 15 20 681124
 16 20 749167
 17 20 480962
 18 20 133266
 19 20 928077
 20 34 2
 10000111010111001100
 1 2 175025
 1 3 372293
 2 3 723523
 2 4 828462
 3 4 96614
 3 5 496039
 4 5 435856
 4 6 728072
 5 6 26736
 5 7 658831
 6 7 294479
 6 8 971178
 7 8 755365
 7 9 467364
 8 9 912893
 8 10 88692
 9 10 132051
 9 11 939008
 10 11 986048
 11 12 676052
 11 13 287187
 12 13 304051
 13 14 305223
 14 15 610873
 14 16 540274
 15 16 494014
 15 17 90777
 16 17 157248
 16 18 211384
 17 18 718096
 17 19 822166
 18 19 366585
 18 20 250962
 19 20 231236
 20 89 6
 00110010100101111001
 1 2 758268
 1 3 205716
 2 3 295263
 1 4 207862
 2 4 69876
 3 4 179798
 2 5 479889
 3 5 953848
 4 5 68337
 1 6 833892
 2 6 234107
 4 6 772558
 5 6 675566
 2 7 942986
 3 7 253909
 4 7 95158
 5 7 119424
 6 7 316766
 2 8 477692
 3 8 406515
 4 8 987774
 5 8 808702
 6 8 184409
 7 8 500278
 3 9 887393
 4 9 469162
 6 9 293078
 7 9 205359
 8 9 777079
 5 10 313301
 6 10 636761
 7 10 846529
 8 10 315392
 9 10 477016
 5 11 29206
 6 11 840608
 7 11 151527
 8 11 877001
 9 11 439665
 10 11 907197
 7 12 815137
 8 12 530916
 9 12 922868
 11 12 827381
 7 13 887939
 8 13 638323
 9 13 311582
 10 13 169399
 11 13 763999
 12 13 695711
 8 14 686748
 9 14 400272
 10 14 39935
 11 14 528026
 12 14 776064
 13 14 965438
 10 15 457267
 12 15 318406
 13 15 3489
 14 15 217063
 11 16 763755
 12 16 711741
 13 16 617167
 14 16 469274
 15 16 845875
 11 17 776936
 12 17 464487
 13 17 682511
 14 17 11831
 15 17 447702
 16 17 10247
 12 18 10991
 13 18 388512
 14 18 312431
 15 18 427326
 16 18 846191
 17 18 977005
 13 19 941472
 14 19 709497
 15 19 343667
 16 19 346238
 17 19 777055
 18 19 703066
 14 20 779760
 15 20 559561
 16 20 810681
 17 20 436275
 18 20 371192
 19 20 42384

样例输出

2402044
 339126
 523926
 4622029
 1721412
*/
//通过率

