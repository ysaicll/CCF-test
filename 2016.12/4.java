/*
��������
��������һ�����֣���֪����a1, a2, ��, an���ֵ�Ƶ�ʷֱ�t1, t2, ��, tn��������01������Щ���ʱ��룬����ÿ��������һ��01����Ӧ��ʹ���κ�һ�����ʵı��루��Ӧ��01����������һ�����ʱ����ǰ׺�����ֱ����Ϊǰ׺�롣
����ʹ��ǰ׺�����һ��������ָ����������е�ÿ���������ζ�Ӧ������롣һ�����־���ǰ׺�����ĳ���Ϊ��
����L=a1�ı��볤�ȡ�t1+a2�ı��볤�ȡ�t2+��+ an�ı��볤�ȡ�tn��
��������һ��ǰ׺����Ϊ�ֵ�����룬ָ����1 �� i < n��ai�ı��루��Ӧ��01�������ֵ�����ai+1����֮ǰ����a1, a2, ��, an�ı����ǰ��ֵ����������еġ�
�������磬����E A E C D E B C C E C B D B E�У� 5������A��B��C��D��E���ֵ�Ƶ�ʷֱ�Ϊ1, 3, 4, 2, 5����һ�ֿ��еı��뷽����A:000, B:001, C:01, D:10, E:11����Ӧ�ı�����01��Ϊ1100011011011001010111010011000111����Ӧ�ĳ���LΪ3��1+3��3+2��4+2��2+2��5=34��
��������������У����ʹ�ù�����(Huffman)���룬��Ӧ�ı��뷽����A:000, B:01, C:10, D:001, E:11����Ȼ�������ֱ������ܳ���ֻ��33������������벻�����ֵ����������ʣ�����C�ı�����ֵ�����D�ı���֮ǰ��
��������������У���Щ�˿��ܻ������һ���ֵ��������A:000, B:001, C:010, D:011, E:1�����������ֳ���Ϊ35��
�������ҳ�һ���ֵ�����룬ʹ�����־��������ĳ���L��С�������ʱ����ֻ��Ҫ�����С�ĳ���L��������Ҫ�������ķ�����������������У���С�ĳ���LΪ34��
�����ʽ
��������ĵ�һ�а���һ������n����ʾ���ʵ�������
�����ڶ��а���n���������ÿո�ָ����ֱ��ʾa1, a2, ��, an���ֵ�Ƶ�ʣ���t1, t2, ��, tn����ע��a1, a2, ��, an������ʲô���ʲ���Ӱ�챾��Ľ⣬����û������a1, a2, ��, an��
�����ʽ
�������һ����������ʾ���־��������ĳ���L����Сֵ��
��������
5
1 3 4 2 5
�������
34
����˵��
������������������������е����ӡ������õ���35��˵������������⣬�����м���Լ����㷨����Ҫ�������������д���ˡ�
����������ģ��Լ��
��������30%������������1 �� n �� 10��1 �� ti �� 20��
��������60%������������1 �� n �� 100��1 �� ti �� 100��
��������100%������������1 �� n �� 1000��1 �� ti �� 10000��
*/
//ͨ����80%
