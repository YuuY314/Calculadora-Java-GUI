package calculadora;
import java.util.*;
public class Calculadora extends javax.swing.JFrame {
    
    double num1, num2;
    int newLabel;
    String operation, text, newText;
    
    public Calculadora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exibirGroup = new javax.swing.ButtonGroup();
        editarGroup = new javax.swing.ButtonGroup();
        panelShowNumbers = new javax.swing.JPanel();
        equationLabel = new javax.swing.JLabel();
        panelPressNumbers = new javax.swing.JPanel();
        num0Btn = new javax.swing.JButton();
        num1Btn = new javax.swing.JButton();
        num2Btn = new javax.swing.JButton();
        num3Btn = new javax.swing.JButton();
        num4Btn = new javax.swing.JButton();
        num5Btn = new javax.swing.JButton();
        num6Btn = new javax.swing.JButton();
        num7Btn = new javax.swing.JButton();
        num8Btn = new javax.swing.JButton();
        num9Btn = new javax.swing.JButton();
        plusminusBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        minusBtn = new javax.swing.JButton();
        timesBtn = new javax.swing.JButton();
        divisionBtn = new javax.swing.JButton();
        clearEntryBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        clearDigitBtn = new javax.swing.JButton();
        percentBtn = new javax.swing.JButton();
        squareRootBtn = new javax.swing.JButton();
        potentiationBtn = new javax.swing.JButton();
        dividePerXBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        exibirBtn = new javax.swing.JMenu();
        padraoBtn = new javax.swing.JRadioButtonMenuItem();
        cientificaBtn = new javax.swing.JRadioButtonMenuItem();
        editarBtn = new javax.swing.JMenu();
        colorDefaultBtn = new javax.swing.JRadioButtonMenuItem();
        colorBlueBtn = new javax.swing.JRadioButtonMenuItem();
        colorRedBtn = new javax.swing.JRadioButtonMenuItem();
        ajudaBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(204, 204, 204));

        panelShowNumbers.setBackground(new java.awt.Color(204, 204, 204));
        panelShowNumbers.setForeground(new java.awt.Color(255, 255, 255));

        equationLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        equationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelShowNumbersLayout = new javax.swing.GroupLayout(panelShowNumbers);
        panelShowNumbers.setLayout(panelShowNumbersLayout);
        panelShowNumbersLayout.setHorizontalGroup(
            panelShowNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShowNumbersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShowNumbersLayout.setVerticalGroup(
            panelShowNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShowNumbersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPressNumbers.setBackground(new java.awt.Color(204, 204, 204));
        panelPressNumbers.setFocusTraversalPolicyProvider(true);

        num0Btn.setBackground(new java.awt.Color(255, 255, 255));
        num0Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num0Btn.setText("0");
        num0Btn.setToolTipText("");
        num0Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num0BtnMouseClicked(evt);
            }
        });

        num1Btn.setBackground(new java.awt.Color(255, 255, 255));
        num1Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num1Btn.setText("1");
        num1Btn.setToolTipText("");
        num1Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1BtnMouseClicked(evt);
            }
        });

        num2Btn.setBackground(new java.awt.Color(255, 255, 255));
        num2Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num2Btn.setText("2");
        num2Btn.setToolTipText("");
        num2Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num2BtnMouseClicked(evt);
            }
        });

        num3Btn.setBackground(new java.awt.Color(255, 255, 255));
        num3Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num3Btn.setText("3");
        num3Btn.setToolTipText("");
        num3Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num3BtnMouseClicked(evt);
            }
        });

        num4Btn.setBackground(new java.awt.Color(255, 255, 255));
        num4Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num4Btn.setText("4");
        num4Btn.setToolTipText("");
        num4Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num4BtnMouseClicked(evt);
            }
        });

        num5Btn.setBackground(new java.awt.Color(255, 255, 255));
        num5Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num5Btn.setText("5");
        num5Btn.setToolTipText("");
        num5Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num5BtnMouseClicked(evt);
            }
        });

        num6Btn.setBackground(new java.awt.Color(255, 255, 255));
        num6Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num6Btn.setText("6");
        num6Btn.setToolTipText("");
        num6Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num6BtnMouseClicked(evt);
            }
        });

        num7Btn.setBackground(new java.awt.Color(255, 255, 255));
        num7Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num7Btn.setText("7");
        num7Btn.setToolTipText("");
        num7Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num7BtnMouseClicked(evt);
            }
        });

        num8Btn.setBackground(new java.awt.Color(255, 255, 255));
        num8Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num8Btn.setText("8");
        num8Btn.setToolTipText("");
        num8Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num8BtnMouseClicked(evt);
            }
        });

        num9Btn.setBackground(new java.awt.Color(255, 255, 255));
        num9Btn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        num9Btn.setText("9");
        num9Btn.setToolTipText("");
        num9Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num9BtnMouseClicked(evt);
            }
        });

        plusminusBtn.setBackground(new java.awt.Color(153, 153, 153));
        plusminusBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        plusminusBtn.setText("?");
        plusminusBtn.setToolTipText("");
        plusminusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusminusBtnMouseClicked(evt);
            }
        });

        dotBtn.setBackground(new java.awt.Color(153, 153, 153));
        dotBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        dotBtn.setText(",");
        dotBtn.setToolTipText("");
        dotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotBtnMouseClicked(evt);
            }
        });

        equalBtn.setBackground(new java.awt.Color(153, 153, 153));
        equalBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setToolTipText("");
        equalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalBtnMouseClicked(evt);
            }
        });

        plusBtn.setBackground(new java.awt.Color(153, 153, 153));
        plusBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        plusBtn.setText("+");
        plusBtn.setToolTipText("");
        plusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusBtnMouseClicked(evt);
            }
        });

        minusBtn.setBackground(new java.awt.Color(153, 153, 153));
        minusBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        minusBtn.setText("-");
        minusBtn.setToolTipText("");
        minusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusBtnMouseClicked(evt);
            }
        });

        timesBtn.setBackground(new java.awt.Color(153, 153, 153));
        timesBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        timesBtn.setText("?");
        timesBtn.setToolTipText("");
        timesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timesBtnMouseClicked(evt);
            }
        });

        divisionBtn.setBackground(new java.awt.Color(153, 153, 153));
        divisionBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        divisionBtn.setText("?");
        divisionBtn.setToolTipText("");
        divisionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionBtnMouseClicked(evt);
            }
        });

        clearEntryBtn.setBackground(new java.awt.Color(153, 153, 153));
        clearEntryBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        clearEntryBtn.setText("CE");
        clearEntryBtn.setToolTipText("");
        clearEntryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearEntryBtnMouseClicked(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(153, 153, 153));
        clearBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        clearBtn.setText("C");
        clearBtn.setToolTipText("");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        clearDigitBtn.setBackground(new java.awt.Color(153, 153, 153));
        clearDigitBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        clearDigitBtn.setText("<=");
        clearDigitBtn.setToolTipText("");
        clearDigitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearDigitBtnMouseClicked(evt);
            }
        });

        percentBtn.setBackground(new java.awt.Color(153, 153, 153));
        percentBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        percentBtn.setText("%");
        percentBtn.setToolTipText("");
        percentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                percentBtnMouseClicked(evt);
            }
        });

        squareRootBtn.setBackground(new java.awt.Color(153, 153, 153));
        squareRootBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        squareRootBtn.setText("Raiz");
        squareRootBtn.setToolTipText("");
        squareRootBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                squareRootBtnMouseClicked(evt);
            }
        });

        potentiationBtn.setBackground(new java.awt.Color(153, 153, 153));
        potentiationBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        potentiationBtn.setText("x?");
        potentiationBtn.setToolTipText("");
        potentiationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potentiationBtnMouseClicked(evt);
            }
        });

        dividePerXBtn.setBackground(new java.awt.Color(153, 153, 153));
        dividePerXBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        dividePerXBtn.setText("1/x");
        dividePerXBtn.setToolTipText("");
        dividePerXBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dividePerXBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPressNumbersLayout = new javax.swing.GroupLayout(panelPressNumbers);
        panelPressNumbers.setLayout(panelPressNumbersLayout);
        panelPressNumbersLayout.setHorizontalGroup(
            panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPressNumbersLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(percentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusminusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num7Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPressNumbersLayout.createSequentialGroup()
                        .addComponent(num5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelPressNumbersLayout.createSequentialGroup()
                            .addComponent(num0Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPressNumbersLayout.createSequentialGroup()
                            .addComponent(num2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(num3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPressNumbersLayout.createSequentialGroup()
                        .addComponent(num8Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num9Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPressNumbersLayout.createSequentialGroup()
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearDigitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPressNumbersLayout.createSequentialGroup()
                        .addComponent(squareRootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potentiationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividePerXBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelPressNumbersLayout.setVerticalGroup(
            panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPressNumbersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareRootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potentiationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividePerXBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearDigitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPressNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusminusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        exibirBtn.setText("Exibir");

        exibirGroup.add(padraoBtn);
        padraoBtn.setSelected(true);
        padraoBtn.setText("Padr?o");
        exibirBtn.add(padraoBtn);

        exibirGroup.add(cientificaBtn);
        cientificaBtn.setText("Cient?fica");
        exibirBtn.add(cientificaBtn);

        menuBar.add(exibirBtn);

        editarBtn.setText("Editar");

        editarGroup.add(colorDefaultBtn);
        colorDefaultBtn.setSelected(true);
        colorDefaultBtn.setText("Cor Padr?o");
        editarBtn.add(colorDefaultBtn);

        editarGroup.add(colorBlueBtn);
        colorBlueBtn.setText("Cor Azul");
        colorBlueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorBlueBtnMouseClicked(evt);
            }
        });
        editarBtn.add(colorBlueBtn);

        editarGroup.add(colorRedBtn);
        colorRedBtn.setText("Cor Vermelha");
        colorRedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorRedBtnMouseClicked(evt);
            }
        });
        editarBtn.add(colorRedBtn);

        menuBar.add(editarBtn);

        ajudaBtn.setText("Ajuda");
        menuBar.add(ajudaBtn);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShowNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPressNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelShowNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPressNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num0BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num0BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("0");
        } else {
            equationLabel.setText(equationLabel.getText()+"0");
        }
    }//GEN-LAST:event_num0BtnMouseClicked

    private void num1BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("1");
        } else {
            equationLabel.setText(equationLabel.getText()+"1");
        }
    }//GEN-LAST:event_num1BtnMouseClicked

    private void num2BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num2BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("2");
        } else {
            equationLabel.setText(equationLabel.getText()+"2");
        }
    }//GEN-LAST:event_num2BtnMouseClicked

    private void num3BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num3BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("3");
        } else {
            equationLabel.setText(equationLabel.getText()+"3");
        }
    }//GEN-LAST:event_num3BtnMouseClicked

    private void num4BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num4BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("4");
        } else {
            equationLabel.setText(equationLabel.getText()+"4");
        }
    }//GEN-LAST:event_num4BtnMouseClicked

    private void num5BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num5BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("5");
        } else {
            equationLabel.setText(equationLabel.getText()+"5");
        }
    }//GEN-LAST:event_num5BtnMouseClicked

    private void num6BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num6BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("6");
        } else {
            equationLabel.setText(equationLabel.getText()+"6");
        }
    }//GEN-LAST:event_num6BtnMouseClicked

    private void num7BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num7BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("7");
        } else {
            equationLabel.setText(equationLabel.getText()+"7");
        }
    }//GEN-LAST:event_num7BtnMouseClicked

    private void num8BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num8BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("8");
        } else {
            equationLabel.setText(equationLabel.getText()+"8");
        }
    }//GEN-LAST:event_num8BtnMouseClicked

    private void num9BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9BtnMouseClicked
        // TODO add your handling code here:
        if(equationLabel.getText().equals("0")){
            equationLabel.setText("9");
        } else {
            equationLabel.setText(equationLabel.getText()+"9");
        }
    }//GEN-LAST:event_num9BtnMouseClicked

    private void plusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        operation = "+";
        equationLabel.setText("");
    }//GEN-LAST:event_plusBtnMouseClicked

    private void minusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        operation = "-";
        equationLabel.setText("");
    }//GEN-LAST:event_minusBtnMouseClicked

    private void timesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        operation = "*";
        equationLabel.setText("");
    }//GEN-LAST:event_timesBtnMouseClicked

    private void equalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalBtnMouseClicked
        // TODO add your handling code here:
        num2 = Double.parseDouble(equationLabel.getText());
        if(operation.equals("+")){
            equationLabel.setText(String.valueOf(num1+num2));
        } else if(operation.equals("-")){
            equationLabel.setText(String.valueOf(num1-num2));
        } else if(operation.equals("*")){
            equationLabel.setText(String.valueOf(num1*num2));
        } else if(operation.equals("/")){
            equationLabel.setText(String.valueOf(num1/num2));
        } else if(operation.equals("r")){
            equationLabel.setText(String.valueOf(num1/num1));
        }
    }//GEN-LAST:event_equalBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        // TODO add your handling code here:
        num1 = 0; num2 = 0; operation = "";
        equationLabel.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void divisionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        operation = "/";
        equationLabel.setText("");
    }//GEN-LAST:event_divisionBtnMouseClicked

    private void clearDigitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearDigitBtnMouseClicked
        // TODO add your handling code here:
        newLabel = Integer.parseInt(equationLabel.getText());
        newLabel = Math.round(newLabel / 10);
        equationLabel.setText(String.valueOf(newLabel));
    }//GEN-LAST:event_clearDigitBtnMouseClicked

    private void percentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percentBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        equationLabel.setText(String.valueOf(num1/100));
    }//GEN-LAST:event_percentBtnMouseClicked

    private void squareRootBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareRootBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        equationLabel.setText(String.valueOf(Math.sqrt(num1)));
    }//GEN-LAST:event_squareRootBtnMouseClicked

    private void potentiationBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potentiationBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        equationLabel.setText(String.valueOf(num1 * num1));
    }//GEN-LAST:event_potentiationBtnMouseClicked

    private void dividePerXBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividePerXBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        equationLabel.setText(String.valueOf(1/num1));
    }//GEN-LAST:event_dividePerXBtnMouseClicked

    private void clearEntryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearEntryBtnMouseClicked
        // TODO add your handling code here:
        num1 = 0; num2 = 0; operation = "";
        equationLabel.setText("");
    }//GEN-LAST:event_clearEntryBtnMouseClicked

    private void plusminusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusminusBtnMouseClicked
        // TODO add your handling code here:
        num1 = Double.parseDouble(equationLabel.getText());
        num1 = -num1;
        equationLabel.setText(String.valueOf(num1));
    }//GEN-LAST:event_plusminusBtnMouseClicked

    private void dotBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotBtnMouseClicked
        // TODO add your handling code here:
        equationLabel.setText(equationLabel.getText()+".");
    }//GEN-LAST:event_dotBtnMouseClicked

    private void colorBlueBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorBlueBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_colorBlueBtnMouseClicked

    private void colorRedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorRedBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_colorRedBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaBtn;
    private javax.swing.JRadioButtonMenuItem cientificaBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton clearDigitBtn;
    private javax.swing.JButton clearEntryBtn;
    private javax.swing.JRadioButtonMenuItem colorBlueBtn;
    private javax.swing.JRadioButtonMenuItem colorDefaultBtn;
    private javax.swing.JRadioButtonMenuItem colorRedBtn;
    private javax.swing.JButton dividePerXBtn;
    private javax.swing.JButton divisionBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JMenu editarBtn;
    private javax.swing.ButtonGroup editarGroup;
    private javax.swing.JButton equalBtn;
    private javax.swing.JLabel equationLabel;
    private javax.swing.JMenu exibirBtn;
    private javax.swing.ButtonGroup exibirGroup;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton num0Btn;
    private javax.swing.JButton num1Btn;
    private javax.swing.JButton num2Btn;
    private javax.swing.JButton num3Btn;
    private javax.swing.JButton num4Btn;
    private javax.swing.JButton num5Btn;
    private javax.swing.JButton num6Btn;
    private javax.swing.JButton num7Btn;
    private javax.swing.JButton num8Btn;
    private javax.swing.JButton num9Btn;
    private javax.swing.JRadioButtonMenuItem padraoBtn;
    private javax.swing.JPanel panelPressNumbers;
    private javax.swing.JPanel panelShowNumbers;
    private javax.swing.JButton percentBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton plusminusBtn;
    private javax.swing.JButton potentiationBtn;
    private javax.swing.JButton squareRootBtn;
    private javax.swing.JButton timesBtn;
    // End of variables declaration//GEN-END:variables
}
