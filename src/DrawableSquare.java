public class DrawableSquare {

        public static void main(String[] args) {
            int sideLengthUuuu = 4;
            char bruschLalala = '*';
            drawSquare(sideLengthUuuu, bruschLalala);
        }

        private static void drawSquare(int sideLength, char brusch) {
            for(int i = 0; i < sideLength; i++) {
                for(int j = 0; j < sideLength; j++) {
                    System.out.print(brusch);
                }
                System.out.println();
            }
        }
    }

