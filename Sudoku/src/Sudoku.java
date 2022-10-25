
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Sudoku extends javax.swing.JFrame {

    /**
     * Creates new form Sudoku
     */
    
    private boolean globalFlag = true;
    private boolean isSolved = true;
    private String turn = "1";
    
    public String solvedBoard [][] = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    
    public Sudoku() {
        initComponents();
    }
    
    public void resetBoard() {
        
        JButton filledBtns[] = {
            txtBtn4, txtBtn7, txtBtn8, txtBtn9, txtBtn10, txtBtn14, txtBtn15, txtBtn16, txtBtn18, 
            txtBtn19, txtBtn21, txtBtn23, txtBtn26, txtBtn32, txtBtn33, txtBtn35, txtBtn38, txtBtn39,
            txtBtn43, txtBtn44, txtBtn47, txtBtn49, txtBtn50, txtBtn56, txtBtn59, txtBtn61, txtBtn63,
            txtBtn64, txtBtn66, txtBtn67, txtBtn68, txtBtn72, txtBtn73, txtBtn74, txtBtn75, txtBtn78
        };
        
        JButton board[][] = {
            {txtBtn1, txtBtn2, txtBtn3, txtBtn4, txtBtn5, txtBtn6, txtBtn7, txtBtn8, txtBtn9},
            {txtBtn10, txtBtn11, txtBtn12, txtBtn13, txtBtn14, txtBtn15, txtBtn16, txtBtn17, txtBtn18},
            {txtBtn19, txtBtn20, txtBtn21, txtBtn22, txtBtn23, txtBtn24, txtBtn25, txtBtn26, txtBtn27},
            {txtBtn28, txtBtn29, txtBtn30, txtBtn31, txtBtn32, txtBtn33, txtBtn34, txtBtn35, txtBtn36},
            {txtBtn37, txtBtn38, txtBtn39, txtBtn40, txtBtn41, txtBtn42, txtBtn43, txtBtn44, txtBtn45},
            {txtBtn46, txtBtn47, txtBtn48, txtBtn49, txtBtn50, txtBtn51, txtBtn52, txtBtn53, txtBtn54},
            {txtBtn55, txtBtn56, txtBtn57, txtBtn58, txtBtn59, txtBtn60, txtBtn61, txtBtn62, txtBtn63},
            {txtBtn64, txtBtn65, txtBtn66, txtBtn67, txtBtn68, txtBtn69, txtBtn70, txtBtn71, txtBtn72},
            {txtBtn73, txtBtn74, txtBtn75, txtBtn76, txtBtn77, txtBtn78, txtBtn79, txtBtn80, txtBtn81}
        };
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                boolean flag = true;
                for(int k = 0; k < filledBtns.length; k++) {
                    if(board[i][j] == filledBtns[k])
                        flag = false;
                }
                if(flag) {
                    board[i][j].setText(null);
                    board[i][j].setForeground(black);
                    board[i][j].setBackground(null);
                }
            }
        }
    }
    
    public void seeSolution() {
        
        JButton filledBtns[] = {
            txtBtn4, txtBtn7, txtBtn8, txtBtn9, txtBtn10, txtBtn14, txtBtn15, txtBtn16, txtBtn18, 
            txtBtn19, txtBtn21, txtBtn23, txtBtn26, txtBtn32, txtBtn33, txtBtn35, txtBtn38, txtBtn39,
            txtBtn43, txtBtn44, txtBtn47, txtBtn49, txtBtn50, txtBtn56, txtBtn59, txtBtn61, txtBtn63,
            txtBtn64, txtBtn66, txtBtn67, txtBtn68, txtBtn72, txtBtn73, txtBtn74, txtBtn75, txtBtn78
        };
        
        JButton board[][] = {
            {txtBtn1, txtBtn2, txtBtn3, txtBtn4, txtBtn5, txtBtn6, txtBtn7, txtBtn8, txtBtn9},
            {txtBtn10, txtBtn11, txtBtn12, txtBtn13, txtBtn14, txtBtn15, txtBtn16, txtBtn17, txtBtn18},
            {txtBtn19, txtBtn20, txtBtn21, txtBtn22, txtBtn23, txtBtn24, txtBtn25, txtBtn26, txtBtn27},
            {txtBtn28, txtBtn29, txtBtn30, txtBtn31, txtBtn32, txtBtn33, txtBtn34, txtBtn35, txtBtn36},
            {txtBtn37, txtBtn38, txtBtn39, txtBtn40, txtBtn41, txtBtn42, txtBtn43, txtBtn44, txtBtn45},
            {txtBtn46, txtBtn47, txtBtn48, txtBtn49, txtBtn50, txtBtn51, txtBtn52, txtBtn53, txtBtn54},
            {txtBtn55, txtBtn56, txtBtn57, txtBtn58, txtBtn59, txtBtn60, txtBtn61, txtBtn62, txtBtn63},
            {txtBtn64, txtBtn65, txtBtn66, txtBtn67, txtBtn68, txtBtn69, txtBtn70, txtBtn71, txtBtn72},
            {txtBtn73, txtBtn74, txtBtn75, txtBtn76, txtBtn77, txtBtn78, txtBtn79, txtBtn80, txtBtn81}
        };
        
        if(globalFlag) {
            for(int i = 0; i < 9; i++) {
                globalFlag = false;
                for(int j = 0; j < 9; j++) {
                    boolean flag = true;
                    for(int k = 0; k < filledBtns.length; k++) {
                        if(board[i][j] == filledBtns[k])
                            flag = false;
                    }
                    if(flag) {
                        board[i][j].setText(solvedBoard[i][j]);
                        board[i][j].setForeground(white);
                        board[i][j].setBackground(gray);
                    }
                }
            }
        }
        else {
            globalFlag = true;
            resetBoard();
        }
    }
    
    public void checkMoves() {
        
        JButton filledBtns[] = {
            txtBtn4, txtBtn7, txtBtn8, txtBtn9, txtBtn10, txtBtn14, txtBtn15, txtBtn16, txtBtn18, 
            txtBtn19, txtBtn21, txtBtn23, txtBtn26, txtBtn32, txtBtn33, txtBtn35, txtBtn38, txtBtn39,
            txtBtn43, txtBtn44, txtBtn47, txtBtn49, txtBtn50, txtBtn56, txtBtn59, txtBtn61, txtBtn63,
            txtBtn64, txtBtn66, txtBtn67, txtBtn68, txtBtn72, txtBtn73, txtBtn74, txtBtn75, txtBtn78
        };
        
        JButton board[][] = {
            {txtBtn1, txtBtn2, txtBtn3, txtBtn4, txtBtn5, txtBtn6, txtBtn7, txtBtn8, txtBtn9},
            {txtBtn10, txtBtn11, txtBtn12, txtBtn13, txtBtn14, txtBtn15, txtBtn16, txtBtn17, txtBtn18},
            {txtBtn19, txtBtn20, txtBtn21, txtBtn22, txtBtn23, txtBtn24, txtBtn25, txtBtn26, txtBtn27},
            {txtBtn28, txtBtn29, txtBtn30, txtBtn31, txtBtn32, txtBtn33, txtBtn34, txtBtn35, txtBtn36},
            {txtBtn37, txtBtn38, txtBtn39, txtBtn40, txtBtn41, txtBtn42, txtBtn43, txtBtn44, txtBtn45},
            {txtBtn46, txtBtn47, txtBtn48, txtBtn49, txtBtn50, txtBtn51, txtBtn52, txtBtn53, txtBtn54},
            {txtBtn55, txtBtn56, txtBtn57, txtBtn58, txtBtn59, txtBtn60, txtBtn61, txtBtn62, txtBtn63},
            {txtBtn64, txtBtn65, txtBtn66, txtBtn67, txtBtn68, txtBtn69, txtBtn70, txtBtn71, txtBtn72},
            {txtBtn73, txtBtn74, txtBtn75, txtBtn76, txtBtn77, txtBtn78, txtBtn79, txtBtn80, txtBtn81}
        };
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j].getText() != solvedBoard[i][j])
                    isSolved = false;
                if(board[i][j].getText() != solvedBoard[i][j] && board[i][j].getText() != "")
                    board[i][j].setBackground(red);
                else if(board[i][j].getText() != "") {
                    boolean flag = true;
                    for(int k = 0; k < filledBtns.length; k++) {
                        if(board[i][j] == filledBtns[k])
                            flag = false;
                    }
                    if(flag)
                        board[i][j].setBackground(green);
                }
            }
        }
        if(isSolved) {
            JFrame frame = new JFrame("Reset");
            JOptionPane.showMessageDialog(frame, "Board solved successfully!!!", 
                    "Sudoku Puzzle Game", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionBtn1 = new javax.swing.JButton();
        selectionBtn2 = new javax.swing.JButton();
        selectionBtn3 = new javax.swing.JButton();
        selectionBtn4 = new javax.swing.JButton();
        selectionBtn5 = new javax.swing.JButton();
        selectionBtn6 = new javax.swing.JButton();
        selectionBtn9 = new javax.swing.JButton();
        selectionBtn7 = new javax.swing.JButton();
        selectionBtn8 = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        checkMovesBtn = new javax.swing.JButton();
        solutionBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBtn10 = new javax.swing.JButton();
        txtBtn11 = new javax.swing.JButton();
        txtBtn12 = new javax.swing.JButton();
        txtBtn1 = new javax.swing.JButton();
        txtBtn19 = new javax.swing.JButton();
        txtBtn21 = new javax.swing.JButton();
        txtBtn20 = new javax.swing.JButton();
        txtBtn2 = new javax.swing.JButton();
        txtBtn3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBtn13 = new javax.swing.JButton();
        txtBtn14 = new javax.swing.JButton();
        txtBtn15 = new javax.swing.JButton();
        txtBtn4 = new javax.swing.JButton();
        txtBtn22 = new javax.swing.JButton();
        txtBtn24 = new javax.swing.JButton();
        txtBtn23 = new javax.swing.JButton();
        txtBtn5 = new javax.swing.JButton();
        txtBtn6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtBtn16 = new javax.swing.JButton();
        txtBtn17 = new javax.swing.JButton();
        txtBtn18 = new javax.swing.JButton();
        txtBtn7 = new javax.swing.JButton();
        txtBtn25 = new javax.swing.JButton();
        txtBtn27 = new javax.swing.JButton();
        txtBtn26 = new javax.swing.JButton();
        txtBtn8 = new javax.swing.JButton();
        txtBtn9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtBtn37 = new javax.swing.JButton();
        txtBtn38 = new javax.swing.JButton();
        txtBtn39 = new javax.swing.JButton();
        txtBtn28 = new javax.swing.JButton();
        txtBtn46 = new javax.swing.JButton();
        txtBtn48 = new javax.swing.JButton();
        txtBtn47 = new javax.swing.JButton();
        txtBtn29 = new javax.swing.JButton();
        txtBtn30 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtBtn43 = new javax.swing.JButton();
        txtBtn44 = new javax.swing.JButton();
        txtBtn45 = new javax.swing.JButton();
        txtBtn34 = new javax.swing.JButton();
        txtBtn52 = new javax.swing.JButton();
        txtBtn54 = new javax.swing.JButton();
        txtBtn53 = new javax.swing.JButton();
        txtBtn35 = new javax.swing.JButton();
        txtBtn36 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtBtn40 = new javax.swing.JButton();
        txtBtn41 = new javax.swing.JButton();
        txtBtn42 = new javax.swing.JButton();
        txtBtn31 = new javax.swing.JButton();
        txtBtn49 = new javax.swing.JButton();
        txtBtn51 = new javax.swing.JButton();
        txtBtn50 = new javax.swing.JButton();
        txtBtn32 = new javax.swing.JButton();
        txtBtn33 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtBtn67 = new javax.swing.JButton();
        txtBtn68 = new javax.swing.JButton();
        txtBtn69 = new javax.swing.JButton();
        txtBtn58 = new javax.swing.JButton();
        txtBtn76 = new javax.swing.JButton();
        txtBtn78 = new javax.swing.JButton();
        txtBtn77 = new javax.swing.JButton();
        txtBtn59 = new javax.swing.JButton();
        txtBtn60 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtBtn70 = new javax.swing.JButton();
        txtBtn71 = new javax.swing.JButton();
        txtBtn72 = new javax.swing.JButton();
        txtBtn61 = new javax.swing.JButton();
        txtBtn79 = new javax.swing.JButton();
        txtBtn81 = new javax.swing.JButton();
        txtBtn80 = new javax.swing.JButton();
        txtBtn62 = new javax.swing.JButton();
        txtBtn63 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        txtBtn64 = new javax.swing.JButton();
        txtBtn65 = new javax.swing.JButton();
        txtBtn66 = new javax.swing.JButton();
        txtBtn55 = new javax.swing.JButton();
        txtBtn73 = new javax.swing.JButton();
        txtBtn75 = new javax.swing.JButton();
        txtBtn74 = new javax.swing.JButton();
        txtBtn56 = new javax.swing.JButton();
        txtBtn57 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Puzzle Game");
        setResizable(false);

        selectionBtn1.setBackground(new java.awt.Color(0, 0, 204));
        selectionBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn1.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn1.setText("1");
        selectionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn1ActionPerformed(evt);
            }
        });

        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn2.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn2.setText("2");
        selectionBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn2ActionPerformed(evt);
            }
        });

        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn3.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn3.setText("3");
        selectionBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn3ActionPerformed(evt);
            }
        });

        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn4.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn4.setText("4");
        selectionBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn4ActionPerformed(evt);
            }
        });

        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn5.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn5.setText("5");
        selectionBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn5ActionPerformed(evt);
            }
        });

        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn6.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn6.setText("6");
        selectionBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn6ActionPerformed(evt);
            }
        });

        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn9.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn9.setText("9");
        selectionBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn9ActionPerformed(evt);
            }
        });

        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn7.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn7.setText("7");
        selectionBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn7ActionPerformed(evt);
            }
        });

        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn8.setForeground(new java.awt.Color(255, 255, 255));
        selectionBtn8.setText("8");
        selectionBtn8.setToolTipText("");
        selectionBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn8ActionPerformed(evt);
            }
        });

        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        checkMovesBtn.setText("CHECK MOVES");
        checkMovesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMovesBtnActionPerformed(evt);
            }
        });

        solutionBtn.setText("SOLUTION");
        solutionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn10.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn10.setText("4");
        txtBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn10ActionPerformed(evt);
            }
        });

        txtBtn11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn11ActionPerformed(evt);
            }
        });

        txtBtn12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn12ActionPerformed(evt);
            }
        });

        txtBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn1ActionPerformed(evt);
            }
        });

        txtBtn19.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn19.setText("7");

        txtBtn21.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn21.setText("6");

        txtBtn20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn20ActionPerformed(evt);
            }
        });

        txtBtn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn2ActionPerformed(evt);
            }
        });

        txtBtn3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn13ActionPerformed(evt);
            }
        });

        txtBtn14.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn14.setText("7");

        txtBtn15.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn15.setText("8");

        txtBtn4.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn4.setText("5");

        txtBtn22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn22ActionPerformed(evt);
            }
        });

        txtBtn24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn24ActionPerformed(evt);
            }
        });

        txtBtn23.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn23.setText("4");

        txtBtn5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn5ActionPerformed(evt);
            }
        });

        txtBtn6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn22, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn16.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn16.setText("5");
        txtBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn16ActionPerformed(evt);
            }
        });

        txtBtn17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn17ActionPerformed(evt);
            }
        });

        txtBtn18.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn18.setText("9");

        txtBtn7.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn7.setText("7");

        txtBtn25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn25ActionPerformed(evt);
            }
        });

        txtBtn27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn27ActionPerformed(evt);
            }
        });

        txtBtn26.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn26.setText("2");

        txtBtn8.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn8.setText("3");

        txtBtn9.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn9.setText("4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn25, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn37ActionPerformed(evt);
            }
        });

        txtBtn38.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn38.setText("3");

        txtBtn39.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn39.setText("4");

        txtBtn28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn28ActionPerformed(evt);
            }
        });

        txtBtn46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn46ActionPerformed(evt);
            }
        });

        txtBtn48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn48ActionPerformed(evt);
            }
        });

        txtBtn47.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn47.setText("6");

        txtBtn29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn29ActionPerformed(evt);
            }
        });

        txtBtn30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtBtn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtBtn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtBtn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn28, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn37, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn46, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn43.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn43.setText("2");
        txtBtn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn43ActionPerformed(evt);
            }
        });

        txtBtn44.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn44.setText("8");

        txtBtn45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn45ActionPerformed(evt);
            }
        });

        txtBtn34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn34ActionPerformed(evt);
            }
        });

        txtBtn52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn52ActionPerformed(evt);
            }
        });

        txtBtn54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn54ActionPerformed(evt);
            }
        });

        txtBtn53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn53ActionPerformed(evt);
            }
        });

        txtBtn35.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn35.setText("9");

        txtBtn36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtBtn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtBtn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtBtn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn34, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn43, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn52, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn40ActionPerformed(evt);
            }
        });

        txtBtn41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn41ActionPerformed(evt);
            }
        });

        txtBtn42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn42ActionPerformed(evt);
            }
        });

        txtBtn31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn31ActionPerformed(evt);
            }
        });

        txtBtn49.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn49.setText("1");

        txtBtn51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn51ActionPerformed(evt);
            }
        });

        txtBtn50.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn50.setText("8");

        txtBtn32.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn32.setText("3");

        txtBtn33.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn33.setText("5");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtBtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtBtn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtBtn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn31, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn40, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn49, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn67.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn67.setText("9");
        txtBtn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn67ActionPerformed(evt);
            }
        });

        txtBtn68.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn68.setText("6");

        txtBtn69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn69ActionPerformed(evt);
            }
        });

        txtBtn58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn58ActionPerformed(evt);
            }
        });

        txtBtn76.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn76ActionPerformed(evt);
            }
        });

        txtBtn78.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn78.setText("1");

        txtBtn77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn77ActionPerformed(evt);
            }
        });

        txtBtn59.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn59.setText("5");

        txtBtn60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtBtn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtBtn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtBtn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn58, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn67, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn76, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn70ActionPerformed(evt);
            }
        });

        txtBtn71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn71ActionPerformed(evt);
            }
        });

        txtBtn72.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn72.setText("2");

        txtBtn61.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn61.setText("9");

        txtBtn79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn79ActionPerformed(evt);
            }
        });

        txtBtn81.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn81ActionPerformed(evt);
            }
        });

        txtBtn80.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn80ActionPerformed(evt);
            }
        });

        txtBtn62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn62ActionPerformed(evt);
            }
        });

        txtBtn63.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn63.setText("6");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtBtn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtBtn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtBtn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn61, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn70, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn79, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBtn64.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn64.setText("3");
        txtBtn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn64ActionPerformed(evt);
            }
        });

        txtBtn65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn65ActionPerformed(evt);
            }
        });

        txtBtn66.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn66.setText("5");

        txtBtn55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn55ActionPerformed(evt);
            }
        });

        txtBtn73.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn73.setText("6");

        txtBtn75.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn75.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn75.setText("9");

        txtBtn74.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn74.setText("8");

        txtBtn56.setBackground(new java.awt.Color(153, 153, 255));
        txtBtn56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn56.setText("4");

        txtBtn57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBtn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtBtn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtBtn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtBtn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBtn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn55, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn64, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBtn74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBtn73, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtBtn75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMovesBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solutionBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(checkMovesBtn)
                    .addComponent(solutionBtn)
                    .addComponent(exitBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectionBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn4ActionPerformed
        // TODO add your handling code here:
        turn = "4";
        selectionBtn4.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn4ActionPerformed

    private void selectionBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn8ActionPerformed
        // TODO add your handling code here:
        turn = "8";
        selectionBtn8.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn8ActionPerformed

    private void txtBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtn10ActionPerformed

    private void txtBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn13ActionPerformed
        // TODO add your handling code here:
        txtBtn13.setText(turn);
        txtBtn13.setBackground(white);
    }//GEN-LAST:event_txtBtn13ActionPerformed

    private void txtBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtn16ActionPerformed

    private void txtBtn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn37ActionPerformed
        // TODO add your handling code here:
        txtBtn37.setText(turn);
        txtBtn37.setBackground(white);
    }//GEN-LAST:event_txtBtn37ActionPerformed

    private void txtBtn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtn43ActionPerformed

    private void txtBtn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn40ActionPerformed
        // TODO add your handling code here:
        txtBtn40.setText(turn);
        txtBtn40.setBackground(white);
    }//GEN-LAST:event_txtBtn40ActionPerformed

    private void txtBtn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtn67ActionPerformed

    private void txtBtn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn70ActionPerformed
        // TODO add your handling code here:
        txtBtn70.setText(turn);
        txtBtn70.setBackground(white);
    }//GEN-LAST:event_txtBtn70ActionPerformed

    private void txtBtn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtn64ActionPerformed

    private void selectionBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn2ActionPerformed
        // TODO add your handling code here:
        turn = "2";
        selectionBtn2.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn2ActionPerformed

    private void selectionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn1ActionPerformed
        // TODO add your handling code here:
        turn = "1";
        selectionBtn1.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn1ActionPerformed

    private void selectionBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn3ActionPerformed
        // TODO add your handling code here:
        turn = "3";
        selectionBtn3.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn3ActionPerformed

    private void selectionBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn5ActionPerformed
        // TODO add your handling code here:
        turn = "5";
        selectionBtn5.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn5ActionPerformed

    private void selectionBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn6ActionPerformed
        // TODO add your handling code here:
        turn = "6";
        selectionBtn6.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn6ActionPerformed

    private void selectionBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn7ActionPerformed
        // TODO add your handling code here:
        turn = "7";
        selectionBtn7.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn9.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn7ActionPerformed

    private void selectionBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBtn9ActionPerformed
        // TODO add your handling code here:
        turn = "9";
        selectionBtn9.setBackground(new java.awt.Color(0, 0, 204));
        
        selectionBtn1.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn2.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn3.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn4.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn5.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn6.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn7.setBackground(new java.awt.Color(102, 102, 255));
        selectionBtn8.setBackground(new java.awt.Color(102, 102, 255));
    }//GEN-LAST:event_selectionBtn9ActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit?", 
                "Sudoku Puzzle Game", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void txtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn1ActionPerformed
        // TODO add your handling code here:
        txtBtn1.setText(turn);
        txtBtn1.setBackground(white);
    }//GEN-LAST:event_txtBtn1ActionPerformed

    private void txtBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn2ActionPerformed
        // TODO add your handling code here:
        txtBtn2.setText(turn);
        txtBtn2.setBackground(white);
    }//GEN-LAST:event_txtBtn2ActionPerformed

    private void txtBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn3ActionPerformed
        // TODO add your handling code here:
        txtBtn3.setText(turn);
        txtBtn3.setBackground(white);
    }//GEN-LAST:event_txtBtn3ActionPerformed

    private void txtBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn5ActionPerformed
        // TODO add your handling code here:
        txtBtn5.setText(turn);
        txtBtn5.setBackground(white);
    }//GEN-LAST:event_txtBtn5ActionPerformed

    private void txtBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn6ActionPerformed
        // TODO add your handling code here:
        txtBtn6.setText(turn);
        txtBtn6.setBackground(white);
    }//GEN-LAST:event_txtBtn6ActionPerformed

    private void txtBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn11ActionPerformed
        // TODO add your handling code here:
        txtBtn11.setText(turn);
        txtBtn11.setBackground(white);
    }//GEN-LAST:event_txtBtn11ActionPerformed

    private void txtBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn12ActionPerformed
        // TODO add your handling code here:
        txtBtn12.setText(turn);
        txtBtn12.setBackground(white);
    }//GEN-LAST:event_txtBtn12ActionPerformed

    private void txtBtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn17ActionPerformed
        // TODO add your handling code here:
        txtBtn17.setText(turn);
        txtBtn17.setBackground(white);
    }//GEN-LAST:event_txtBtn17ActionPerformed

    private void txtBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn20ActionPerformed
        // TODO add your handling code here:
        txtBtn20.setText(turn);
        txtBtn20.setBackground(white);
    }//GEN-LAST:event_txtBtn20ActionPerformed

    private void txtBtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn22ActionPerformed
        // TODO add your handling code here:
        txtBtn22.setText(turn);
        txtBtn22.setBackground(white);
    }//GEN-LAST:event_txtBtn22ActionPerformed

    private void txtBtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn24ActionPerformed
        // TODO add your handling code here:
        txtBtn24.setText(turn);
        txtBtn24.setBackground(white);
    }//GEN-LAST:event_txtBtn24ActionPerformed

    private void txtBtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn25ActionPerformed
        // TODO add your handling code here:
        txtBtn25.setText(turn);
        txtBtn25.setBackground(white);
    }//GEN-LAST:event_txtBtn25ActionPerformed

    private void txtBtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn27ActionPerformed
        // TODO add your handling code here:
        txtBtn27.setText(turn);
        txtBtn27.setBackground(white);
    }//GEN-LAST:event_txtBtn27ActionPerformed

    private void txtBtn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn28ActionPerformed
        // TODO add your handling code here:
        txtBtn28.setText(turn);
        txtBtn28.setBackground(white);
    }//GEN-LAST:event_txtBtn28ActionPerformed

    private void txtBtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn29ActionPerformed
        // TODO add your handling code here:
        txtBtn29.setText(turn);
        txtBtn29.setBackground(white);
    }//GEN-LAST:event_txtBtn29ActionPerformed

    private void txtBtn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn30ActionPerformed
        // TODO add your handling code here:
        txtBtn30.setText(turn);
        txtBtn30.setBackground(white);
    }//GEN-LAST:event_txtBtn30ActionPerformed

    private void txtBtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn31ActionPerformed
        // TODO add your handling code here:
        txtBtn31.setText(turn);
        txtBtn31.setBackground(white);
    }//GEN-LAST:event_txtBtn31ActionPerformed

    private void txtBtn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn34ActionPerformed
        // TODO add your handling code here:
        txtBtn34.setText(turn);
        txtBtn34.setBackground(white);
    }//GEN-LAST:event_txtBtn34ActionPerformed

    private void txtBtn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn36ActionPerformed
        // TODO add your handling code here:
        txtBtn36.setText(turn);
        txtBtn36.setBackground(white);
    }//GEN-LAST:event_txtBtn36ActionPerformed

    private void txtBtn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn41ActionPerformed
        // TODO add your handling code here:
        txtBtn41.setText(turn);
        txtBtn41.setBackground(white);
    }//GEN-LAST:event_txtBtn41ActionPerformed

    private void txtBtn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn42ActionPerformed
        // TODO add your handling code here:
        txtBtn42.setText(turn);
        txtBtn42.setBackground(white);
    }//GEN-LAST:event_txtBtn42ActionPerformed

    private void txtBtn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn45ActionPerformed
        // TODO add your handling code here:
        txtBtn45.setText(turn);
        txtBtn45.setBackground(white);
    }//GEN-LAST:event_txtBtn45ActionPerformed

    private void txtBtn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn46ActionPerformed
        // TODO add your handling code here:
        txtBtn46.setText(turn);
        txtBtn46.setBackground(white);
    }//GEN-LAST:event_txtBtn46ActionPerformed

    private void txtBtn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn48ActionPerformed
        // TODO add your handling code here:
        txtBtn48.setText(turn);
        txtBtn48.setBackground(white);
    }//GEN-LAST:event_txtBtn48ActionPerformed

    private void txtBtn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn51ActionPerformed
        // TODO add your handling code here:
        txtBtn51.setText(turn);
        txtBtn51.setBackground(white);
    }//GEN-LAST:event_txtBtn51ActionPerformed

    private void txtBtn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn52ActionPerformed
        // TODO add your handling code here:
        txtBtn52.setText(turn);
        txtBtn52.setBackground(white);
    }//GEN-LAST:event_txtBtn52ActionPerformed

    private void txtBtn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn53ActionPerformed
        // TODO add your handling code here:
        txtBtn53.setText(turn);
        txtBtn53.setBackground(white);
    }//GEN-LAST:event_txtBtn53ActionPerformed

    private void txtBtn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn54ActionPerformed
        // TODO add your handling code here:
        txtBtn54.setText(turn);
        txtBtn54.setBackground(white);
    }//GEN-LAST:event_txtBtn54ActionPerformed

    private void txtBtn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn55ActionPerformed
        // TODO add your handling code here:
        txtBtn55.setText(turn);
        txtBtn55.setBackground(white);
    }//GEN-LAST:event_txtBtn55ActionPerformed

    private void txtBtn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn57ActionPerformed
        // TODO add your handling code here:
        txtBtn57.setText(turn);
        txtBtn57.setBackground(white);
    }//GEN-LAST:event_txtBtn57ActionPerformed

    private void txtBtn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn58ActionPerformed
        // TODO add your handling code here:
        txtBtn58.setText(turn);
        txtBtn58.setBackground(white);
    }//GEN-LAST:event_txtBtn58ActionPerformed

    private void txtBtn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn60ActionPerformed
        // TODO add your handling code here:
        txtBtn60.setText(turn);
        txtBtn60.setBackground(white);
    }//GEN-LAST:event_txtBtn60ActionPerformed

    private void txtBtn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn62ActionPerformed
        // TODO add your handling code here:
        txtBtn62.setText(turn);
        txtBtn62.setBackground(white);
    }//GEN-LAST:event_txtBtn62ActionPerformed

    private void txtBtn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn65ActionPerformed
        // TODO add your handling code here:
        txtBtn65.setText(turn);
        txtBtn65.setBackground(white);
    }//GEN-LAST:event_txtBtn65ActionPerformed

    private void txtBtn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn69ActionPerformed
        // TODO add your handling code here:
        txtBtn69.setText(turn);
        txtBtn69.setBackground(white);
    }//GEN-LAST:event_txtBtn69ActionPerformed

    private void txtBtn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn71ActionPerformed
        // TODO add your handling code here:
        txtBtn71.setText(turn);
        txtBtn71.setBackground(white);
    }//GEN-LAST:event_txtBtn71ActionPerformed

    private void txtBtn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn76ActionPerformed
        // TODO add your handling code here:
        txtBtn76.setText(turn);
        txtBtn76.setBackground(white);
    }//GEN-LAST:event_txtBtn76ActionPerformed

    private void txtBtn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn77ActionPerformed
        // TODO add your handling code here:
        txtBtn77.setText(turn);
        txtBtn77.setBackground(white);
    }//GEN-LAST:event_txtBtn77ActionPerformed

    private void txtBtn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn79ActionPerformed
        // TODO add your handling code here:
        txtBtn79.setText(turn);
        txtBtn79.setBackground(white);
    }//GEN-LAST:event_txtBtn79ActionPerformed

    private void txtBtn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn80ActionPerformed
        // TODO add your handling code here:
        txtBtn80.setText(turn);
        txtBtn80.setBackground(white);
    }//GEN-LAST:event_txtBtn80ActionPerformed

    private void txtBtn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn81ActionPerformed
        // TODO add your handling code here:
        txtBtn81.setText(turn);
        txtBtn81.setBackground(white);
    }//GEN-LAST:event_txtBtn81ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");
        if (JOptionPane.showConfirmDialog(frame, "Do you want to reset the board?", 
                "Sudoku Puzzle Game", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            resetBoard();
        }
    }//GEN-LAST:event_resetBtnActionPerformed

    private void solutionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionBtnActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionBtnActionPerformed

    private void checkMovesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMovesBtnActionPerformed
        // TODO add your handling code here:
        checkMoves();
    }//GEN-LAST:event_checkMovesBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkMovesBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton selectionBtn1;
    private javax.swing.JButton selectionBtn2;
    private javax.swing.JButton selectionBtn3;
    private javax.swing.JButton selectionBtn4;
    private javax.swing.JButton selectionBtn5;
    private javax.swing.JButton selectionBtn6;
    private javax.swing.JButton selectionBtn7;
    private javax.swing.JButton selectionBtn8;
    private javax.swing.JButton selectionBtn9;
    private javax.swing.JButton solutionBtn;
    private javax.swing.JButton txtBtn1;
    private javax.swing.JButton txtBtn10;
    private javax.swing.JButton txtBtn11;
    private javax.swing.JButton txtBtn12;
    private javax.swing.JButton txtBtn13;
    private javax.swing.JButton txtBtn14;
    private javax.swing.JButton txtBtn15;
    private javax.swing.JButton txtBtn16;
    private javax.swing.JButton txtBtn17;
    private javax.swing.JButton txtBtn18;
    private javax.swing.JButton txtBtn19;
    private javax.swing.JButton txtBtn2;
    private javax.swing.JButton txtBtn20;
    private javax.swing.JButton txtBtn21;
    private javax.swing.JButton txtBtn22;
    private javax.swing.JButton txtBtn23;
    private javax.swing.JButton txtBtn24;
    private javax.swing.JButton txtBtn25;
    private javax.swing.JButton txtBtn26;
    private javax.swing.JButton txtBtn27;
    private javax.swing.JButton txtBtn28;
    private javax.swing.JButton txtBtn29;
    private javax.swing.JButton txtBtn3;
    private javax.swing.JButton txtBtn30;
    private javax.swing.JButton txtBtn31;
    private javax.swing.JButton txtBtn32;
    private javax.swing.JButton txtBtn33;
    private javax.swing.JButton txtBtn34;
    private javax.swing.JButton txtBtn35;
    private javax.swing.JButton txtBtn36;
    private javax.swing.JButton txtBtn37;
    private javax.swing.JButton txtBtn38;
    private javax.swing.JButton txtBtn39;
    private javax.swing.JButton txtBtn4;
    private javax.swing.JButton txtBtn40;
    private javax.swing.JButton txtBtn41;
    private javax.swing.JButton txtBtn42;
    private javax.swing.JButton txtBtn43;
    private javax.swing.JButton txtBtn44;
    private javax.swing.JButton txtBtn45;
    private javax.swing.JButton txtBtn46;
    private javax.swing.JButton txtBtn47;
    private javax.swing.JButton txtBtn48;
    private javax.swing.JButton txtBtn49;
    private javax.swing.JButton txtBtn5;
    private javax.swing.JButton txtBtn50;
    private javax.swing.JButton txtBtn51;
    private javax.swing.JButton txtBtn52;
    private javax.swing.JButton txtBtn53;
    private javax.swing.JButton txtBtn54;
    private javax.swing.JButton txtBtn55;
    private javax.swing.JButton txtBtn56;
    private javax.swing.JButton txtBtn57;
    private javax.swing.JButton txtBtn58;
    private javax.swing.JButton txtBtn59;
    private javax.swing.JButton txtBtn6;
    private javax.swing.JButton txtBtn60;
    private javax.swing.JButton txtBtn61;
    private javax.swing.JButton txtBtn62;
    private javax.swing.JButton txtBtn63;
    private javax.swing.JButton txtBtn64;
    private javax.swing.JButton txtBtn65;
    private javax.swing.JButton txtBtn66;
    private javax.swing.JButton txtBtn67;
    private javax.swing.JButton txtBtn68;
    private javax.swing.JButton txtBtn69;
    private javax.swing.JButton txtBtn7;
    private javax.swing.JButton txtBtn70;
    private javax.swing.JButton txtBtn71;
    private javax.swing.JButton txtBtn72;
    private javax.swing.JButton txtBtn73;
    private javax.swing.JButton txtBtn74;
    private javax.swing.JButton txtBtn75;
    private javax.swing.JButton txtBtn76;
    private javax.swing.JButton txtBtn77;
    private javax.swing.JButton txtBtn78;
    private javax.swing.JButton txtBtn79;
    private javax.swing.JButton txtBtn8;
    private javax.swing.JButton txtBtn80;
    private javax.swing.JButton txtBtn81;
    private javax.swing.JButton txtBtn9;
    // End of variables declaration//GEN-END:variables
}
