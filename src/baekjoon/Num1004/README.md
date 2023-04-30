# 어린왕자 / 星の王子さま / The little Prince
----
## 문제 / 問題 / Problem
----
어린 왕자는 소혹성 B-664에서 자신이 사랑하는 한 송이 장미를 위해 살아간다. 어느 날 장미가 위험에 빠지게 된 것을 알게 된 어린 왕자는, 장미를 구하기 위해 은하수를 따라 긴 여행을 하기 시작했다. 하지만 어린 왕자의 우주선은 그렇게 좋지 않아서 행성계 간의 이동을 최대한 피해서 여행해야 한다. 아래의 그림은 어린 왕자가 펼쳐본 은하수 지도의 일부이다.

빨간 실선은 어린 왕자가 출발점에서 도착점까지 도달하는데 있어서 필요한 행성계 진입/이탈 횟수를 최소화하는 경로이며, 원은 행성계의 경계를 의미한다. 이러한 경로는 여러 개 존재할 수 있지만 적어도 3번의 행성계 진입/이탈이 필요하다는 것을 알 수 있다.

위와 같은 은하수 지도, 출발점, 도착점이 주어졌을 때 어린 왕자에게 필요한 최소의 행성계 진입/이탈 횟수를 구하는 프로그램을 작성해 보자. 행성계의 경계가 맞닿거나 서로 교차하는 경우는 없다. 또한, 출발점이나 도착점이 행성계 경계에 걸쳐진 경우 역시 입력으로 주어지지 않는다.

星の王子様は素惑星B-664から自分が愛する一本薔薇の為に生きて行く。ある日薔薇が危険に落ちたのを分かった星の王子さまは、薔薇を助ける為に天の川に着いて長い旅をし始めた。しかし星の王子様の宇宙船はそんなに良くなくて惑星界間の移動をできるだけ避けて旅行しなければならない。 下の図は、若い王子が広げた天の川の地図の一部だ。

赤い実線は、若い王子が出発点から到着点まで到達するのに必要な惑星系の進入／離脱回数を最小化する経路であり、円は惑星系の境界を意味する。 これらの経路はいくつか存在することができますが、少なくとも3回の惑星系の入り口/出口が必要であることがわかります。

上記のような天の川の地図、出発点、到着点が与えられたときに、若い王子に必要な最小の惑星系進入/離脱回数を求めるプログラムを作成してみよう。 惑星系の境界が当たったり、互いに交差することはない。 また、出発点や到着点が惑星界境界にまたがった場合も入力として与えられない。

A little prince lives on the asteroid B-664 for the rose he loves. The little prince, who one day learned that the rose was in danger, set off on a long journey along the Milky Way to rescue her rose. But the little prince's spaceship isn't that good, so he has to travel as far as possible avoiding movement between planetary systems. The picture below is part of the map of the Milky Way as seen by the little prince.

The red solid line is the path that minimizes the number of entering/exiting the planetary system required for the little prince to reach from the starting point to the ending point, and the circle means the boundary of the planetary system. There may be several such routes, but it can be seen that at least 3 entry/exit systems are required.

Let's write a program to find the minimum number of times the little prince needs to enter/leave the planetary system given the Milky Way map, starting point, and ending point as above. There are no cases where the boundaries of planetary systems touch or intersect. In addition, if the starting point or the destination point crosses the border of the planetary system, it is not given as an input either.

## 입력 / 入力 / Input
----
입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트케이스에 대해 첫째 줄에 출발점 (x1, y1)과 도착점 (x2, y2)이 주어진다. 두 번째 줄에는 행성계의 개수 n이 주어지며, 세 번째 줄부터 n줄에 걸쳐 행성계의 중점과 반지름 (cx, cy, r)이 주어진다.

入力の最初の行にはテストケースの数Tが与えられます。 次の行から各テストケースの最初の行に出発点（x1、y1）と到着点（x2、y2）が与えられます。 ２行目には惑星系の個数ｎが与えられ、３行目からｎ行にわたって惑星系の中点と半径（ｃｘ，ｃｙ，ｒ）が与えられる。

In the first line of input, the number T of test cases is given. Starting from the next line, the first line for each test case gives the starting point (x1, y1) and the ending point (x2, y2). In the second line, the number of planetary systems n is given, and from the third to n lines, the midpoint and radius (cx, cy, r) of the planetary system are given.

## 출력 / 出力 / Output
----
각 테스트 케이스에 대해 어린 왕자가 거쳐야 할 최소의 행성계 진입/이탈 횟수를 출력한다.

各テストケースに対して、若い王子が通過しなければならない最小の惑星系進入/離脱回数を出力する。

For each test case, output the minimum number of times the little prince must enter/exit the planetary system.

## 제한 / 制限　/ Limit
----
- -1000 ≤ x1, y1, x2, y2, cx, cy ≤ 1000
- 1 ≤ r ≤ 1000
- 1 ≤ n ≤ 50
- 좌표와 반지름은 모두 정수 / 座標と半径はともに整数 / Coordinates and radii are both integers
