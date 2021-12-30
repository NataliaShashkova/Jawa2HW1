package ru.geekbrains;

public class VerticalRacing {
    public static void main(String[] args) {
        Players [] players = new Players[15];
       Livers [] livers = new Livers[10];

        for (int i = 0; i< players.length; i=i+3){
            players[i] = new LHomme((int)(Math.random()*2),(int)(Math.random()*300), i);
            players[i+1] = new Cat((int)(Math.random()*4),(int)(Math.random()*600), i+1);
            players[i+2] = new Robot((int)(Math.random()*10),(int)(Math.random()*1200), i+2);
        }
        for (int i = 0; i< livers.length; i=i+2){
            livers[i] = new Wall((int)(Math.random()*7));
            livers[i+1] = new Treadmill((int)(Math.random()*1000));
        }
        for (int  i=0; i < livers.length; i++){   // Здесь пишем players.length чтобы всю полосу препятствий проходили по очереди
            for (int j = 0; j < players.length; j++){   // Здесь пишем obstacles.length чтобы всю полосу препятствий проходили по очереди

                /**
                 obstacles[j].jump(players[i].getJumpLimit(),players[i]); // раскомментировать этот код для другого варианта прохождения препятствий
                 obstacles[j].runAway(players[i].getRunLimit(),players[i]);
                 */

                livers[i].jump(players[j].getJumpLimit(),players[j]);      //Данный кусок
               livers[i].runAway(players[j].getRunLimit(),players[j]);      //Закомментировать
            }
        }
    }
}