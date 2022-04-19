package tr.edu.maltepe.oop;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris2Main extends JPanel {
    private static final long serialVersionUID = -8715353373678321308L;
    private final Point[][][] Tetraminos = new Point[][][]{{{new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)}, {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)}, {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)}, {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)}}, {{new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0)}, {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2)}, {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2)}, {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0)}}, {{new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2)}, {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2)}, {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0)}, {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0)}}, {{new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)}, {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)}, {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)}, {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)}}, {{new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1)}, {new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2)}, {new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1)}, {new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2)}}, {{new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 1)}, {new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2)}, {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(1, 2)}, {new Point(1, 0), new Point(1, 1), new Point(2, 1), new Point(1, 2)}}, {{new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1)}, {new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2)}, {new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1)}, {new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2)}}};
    private final Color[] tetraminoColors;
    private Point pieceOrigin;
    private int currentPiece;
    private int rotation;
    private ArrayList<Integer> nextPieces;
    private long score;
    private Color[][] well;

    public Tetris2Main() {
        this.tetraminoColors = new Color[]{Color.cyan, Color.blue, Color.orange, Color.yellow, Color.green, Color.pink, Color.red};
        this.nextPieces = new ArrayList();
    }

    private void init() {
        this.well = new Color[12][24];

        for(int i = 0; i < 12; ++i) {
            for(int j = 0; j < 23; ++j) {
                if (i != 0 && i != 11 && j != 22) {
                    this.well[i][j] = Color.BLACK;
                } else {
                    this.well[i][j] = Color.GRAY;
                }
            }
        }

        this.newPiece();
    }

    public void newPiece() {
        this.pieceOrigin = new Point(5, 2);
        this.rotation = 0;
        if (this.nextPieces.isEmpty()) {
            Collections.addAll(this.nextPieces, new Integer[]{0, 1, 2, 3, 4, 5, 6});
            Collections.shuffle(this.nextPieces);
        }

        this.currentPiece = (Integer)this.nextPieces.get(0);
        this.nextPieces.remove(0);
    }

    private boolean collidesAt(int x, int y, int rotation) {
        Point[] var4 = this.Tetraminos[this.currentPiece][rotation];
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Point p = var4[var6];
            if (this.well[p.x + x][p.y + y] != Color.BLACK) {
                return true;
            }
        }

        return false;
    }

    public void rotate(int i) {
        int newRotation = (this.rotation + i) % 4;
        if (newRotation < 0) {
            newRotation = 3;
        }

        if (!this.collidesAt(this.pieceOrigin.x, this.pieceOrigin.y, newRotation)) {
            this.rotation = newRotation;
        }

        this.repaint();
    }

    public void move(int i) {
        if (!this.collidesAt(this.pieceOrigin.x + i, this.pieceOrigin.y, this.rotation)) {
            Point var10000 = this.pieceOrigin;
            var10000.x += i;
        }

        this.repaint();
    }

    public void dropDown() {
        if (!this.collidesAt(this.pieceOrigin.x, this.pieceOrigin.y + 1, this.rotation)) {
            ++this.pieceOrigin.y;
        } else {
            this.fixToWell();
        }

        this.repaint();
    }

    public void fixToWell() {
        Point[] var1 = this.Tetraminos[this.currentPiece][this.rotation];
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Point p = var1[var3];
            this.well[this.pieceOrigin.x + p.x][this.pieceOrigin.y + p.y] = this.tetraminoColors[this.currentPiece];
        }

        this.clearRows();
        this.newPiece();
    }

    public void deleteRow(int row) {
        for(int j = row - 1; j > 0; --j) {
            for(int i = 1; i < 11; ++i) {
                this.well[i][j + 1] = this.well[i][j];
            }
        }

    }

    public void clearRows() {
        int numClears = 0;

        for(int j = 21; j > 0; --j) {
            boolean gap = false;

            for(int i = 1; i < 11; ++i) {
                if (this.well[i][j] == Color.BLACK) {
                    gap = true;
                    break;
                }
            }

            if (!gap) {
                this.deleteRow(j);
                ++j;
                ++numClears;
            }
        }

        switch(numClears) {
            case 1:
                this.score += 100L;
                break;
            case 2:
                this.score += 300L;
                break;
            case 3:
                this.score += 500L;
                break;
            case 4:
                this.score += 800L;
        }

    }

    private void drawPiece(Graphics g) {
        g.setColor(this.tetraminoColors[this.currentPiece]);
        Point[] var2 = this.Tetraminos[this.currentPiece][this.rotation];
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Point p = var2[var4];
            g.fillRect((p.x + this.pieceOrigin.x) * 26, (p.y + this.pieceOrigin.y) * 26, 25, 25);
        }

    }

    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, 312, 598);

        for(int i = 0; i < 12; ++i) {
            for(int j = 0; j < 23; ++j) {
                g.setColor(this.well[i][j]);
                g.fillRect(26 * i, 26 * j, 25, 25);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("" + this.score, 228, 25);
        this.drawPiece(g);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Tetris");
        f.setDefaultCloseOperation(3);
        f.setSize(322, 623);
        f.setVisible(true);
        final Tetris2Main game = new Tetris2Main();
        game.init();
        f.add(game);
        f.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case 32:
                        game.dropDown();
                        game.score = game.score + 1L;
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    default:
                        break;
                    case 37:
                        game.move(-1);
                        break;
                    case 38:
                        game.rotate(-1);
                        break;
                    case 39:
                        game.move(1);
                        break;
                    case 40:
                        game.rotate(1);
                }

            }

            public void keyReleased(KeyEvent e) {
            }
        });

        (new Thread() {
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000L);
                        game.dropDown();
                    } catch (InterruptedException var2) {
                    }
                }
            }
        }).start();
    }
}
