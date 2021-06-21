public class Maze{
    public static void main(String [] args){
        char[][] maze=new char[11][13];
        int x=1,y=1;
        System.out.println("Skelton maze");
        System.out.println("-------------");
        char[][] creatingMaze=creatingMaze(maze);
        System.out.println("The solved maze");
        System.out.println("------------");
        char[][] createdMaze=pathFinding(creatingMaze,x,y);
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                System.out.print(createdMaze[i][j]);
            }
            System.out.println();
        }
    }
    public static char[][] pathFinding(char[][] creatingMaze,int x,int y){
        int right=creatingMaze[x][y+1];
        int left=creatingMaze[x][y-1];
        int up=creatingMaze[x-1][y];
        int down=creatingMaze[x+1][y];
        if(right=='E'||left=='E'||up=='E'||down=='E')
        {
            return creatingMaze;
        }
        else if(down==' ')
        {
            creatingMaze[x+1][y]='*';
            pathFinding(creatingMaze,x+1,y);
        }
        else if(right==' ')
        {
            creatingMaze[x][y+1]='*';
            pathFinding(creatingMaze,x,y+1);
        }
        else if(up==' ')
        {
            creatingMaze[x-1][y]='*';
            pathFinding(creatingMaze,x-1,y);
        }
        else if(left==' ')
        {
            creatingMaze[x][y-1]='*';
            pathFinding(creatingMaze,x,y-1);
        }
        return creatingMaze;
    }
    public static char[][] creatingMaze(char[][] maze){
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<12;j++)
            {
                if(i==0 && j<11 ||i<9 && j==0||i==9 && j<11||j==10&&i<9)
                {
                    maze[i][j]='$';
                    maze[0][1]='S';
                    maze[8][9]='E';
                    maze[1][2]='$'; maze[1][5]='$'; maze[1][6]='$';
                    maze[2][2]='$'; maze[2][5]='$'; maze[2][6]='$'; maze[2][8]='$';
                    maze[3][3]='$'; maze[3][5]='$'; maze[5][7]='$';
                    maze[4][2]='$'; maze[4][6]='$'; maze[4][4]='$'; maze[4][8]='$';
                    maze[5][4]='$'; maze[5][7]='$'; maze[5][8]='$';
                    maze[6][1]='$'; maze[6][8]='$'; maze[6][4]='$'; maze[6][5]='$'; maze[6][9]='$';
                    maze[7][2]='$'; maze[7][7]='$'; maze[7][6]='$'; maze[7][7]='$'; maze[6][8]='$';
                    maze[8][2]='$'; maze[8][3]='$';
                }
                else{
                    maze[i][j]=' ';
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<12;j++)
            {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
        return maze;
    }
}





        
    

