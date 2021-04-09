package Vews;

import Vews.Hospede.PainelHospedes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Zita
 */
public class PainelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PainelPrincipal
     */
    boolean a=true;
    PainelQuartos tq = new PainelQuartos();
    PainelHospedes painelHospedes = new PainelHospedes();
    
    BasicInternalFrameUI bi = (BasicInternalFrameUI)painelHospedes.getUI();
    
    
    Font font;
    public PainelPrincipal() {
        this.font = new Font(Font.SERIF,Font.PLAIN,20);
        
        initComponents();
       // PainelQuartos.setLayout(new MigLayout("wrap 5"));
       bi.setNorthPane(null);
       
       Date date =new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
       data.setText(sdf.format(date));
       setExtendedState(MAXIMIZED_BOTH);
       jDesktopPane2.add(painelHospedes);
       painelHospedes.setVisible(true);
    }
      
    public void ChangeColor(JPanel painel,Color cor){
        painel.setBackground(cor);
    }
    
    public void clickmenu(JPanel h1,int numberbool){
        if(numberbool==1){
            h1.setBackground(new Color(245,239,239));
            
        }else{
            h1.setBackground(new Color(86,86,86));
            
        }
    }
    public void hideShowMenu(JPanel menuShowHide,boolean dashboard){
        if (dashboard==true){
            sideFirstPanel.setPreferredSize(new Dimension(350,sideFirstPanel.getHeight()));
            changeIcon(menu,"/Images/back_45px.png");
        }else{
            sideFirstPanel.setPreferredSize(new Dimension(100,sideFirstPanel.getHeight()));
            changeIcon(menu,"/Images/menu_45px.png");
        }
    
    }
    public void changeIcon(JLabel button,String source){
        ImageIcon img = new ImageIcon(getClass().getResource(source));
        button.setIcon(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("1opcao.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        header = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        logoName = new javax.swing.JLabel();
        subHeader = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sideFirstPanel = new javax.swing.JPanel();
        sideSecPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        menuButton = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        lineHome = new javax.swing.JPanel();
        homeButton = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        lineReservas = new javax.swing.JPanel();
        resButton = new javax.swing.JPanel();
        reservas = new javax.swing.JLabel();
        lineHospedagem = new javax.swing.JPanel();
        hospButton = new javax.swing.JPanel();
        hospedagem = new javax.swing.JLabel();
        lineHospede = new javax.swing.JPanel();
        HospedeButton = new javax.swing.JPanel();
        clients = new javax.swing.JLabel();
        lineUsers = new javax.swing.JPanel();
        userButton = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lockButton = new javax.swing.JPanel();
        lock = new javax.swing.JLabel();
        inButton = new javax.swing.JPanel();
        in = new javax.swing.JLabel();
        outButton = new javax.swing.JPanel();
        out = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        header.setBackground(new Color(0,0,0,1));
        header.setPreferredSize(new java.awt.Dimension(350, 60));
        header.setLayout(new java.awt.BorderLayout());

        logo.setBackground(new Color(86,86,86));
        logo.setPreferredSize(new java.awt.Dimension(350, 80));

        logoName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        logoName.setForeground(new java.awt.Color(245, 239, 239));
        logoName.setText("A | J's House");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logoName)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.add(logo, java.awt.BorderLayout.LINE_START);

        subHeader.setBackground(new Color(86,86,86));
        subHeader.setDoubleBuffered(false);
        subHeader.setPreferredSize(new java.awt.Dimension(700, 80));
        subHeader.setLayout(new FlowLayout(FlowLayout.RIGHT));

        exitButton.setBackground(new java.awt.Color(86, 86, 86));
        exitButton.setPreferredSize(new java.awt.Dimension(95, 38));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 239, 239));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jLabel3.setText("Exit");

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        subHeader.add(exitButton);

        header.add(subHeader, java.awt.BorderLayout.CENTER);

        jDesktopPane1.add(header, java.awt.BorderLayout.PAGE_START);

        //jPanel1.setBackground(new Color(238,225,225,1));
        sideFirstPanel.setBackground(new java.awt.Color(194, 194, 194,1));
        sideFirstPanel.setPreferredSize(new java.awt.Dimension(335, 588));
        sideFirstPanel.setLayout(new java.awt.BorderLayout());

        sideSecPanel.setBackground(new java.awt.Color(255, 255, 255));
        sideSecPanel.setPreferredSize(new java.awt.Dimension(300, 588));
        sideSecPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(350, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        menuButton.setAlignmentY(5.0F);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButtonMouseExited(evt);
            }
        });

        menu.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(86, 86, 86));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_menu_45px.png"))); // NOI18N
        menu.setText("          Menu");

        javax.swing.GroupLayout menuButtonLayout = new javax.swing.GroupLayout(menuButton);
        menuButton.setLayout(menuButtonLayout);
        menuButtonLayout.setHorizontalGroup(
            menuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuButtonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuButtonLayout.setVerticalGroup(
            menuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuButtonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(menu)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sideSecPanel.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 320, 70));

        lineHome.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout lineHomeLayout = new javax.swing.GroupLayout(lineHome);
        lineHome.setLayout(lineHomeLayout);
        lineHomeLayout.setHorizontalGroup(
            lineHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lineHomeLayout.setVerticalGroup(
            lineHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, -1, -1));

        homeButton.setPreferredSize(new java.awt.Dimension(320, 70));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });

        home.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(82, 82, 82));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_45px_1.png"))); // NOI18N
        home.setText("          Home");

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(home)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sideSecPanel.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 320, -1));

        javax.swing.GroupLayout lineReservasLayout = new javax.swing.GroupLayout(lineReservas);
        lineReservas.setLayout(lineReservasLayout);
        lineReservasLayout.setHorizontalGroup(
            lineReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lineReservasLayout.setVerticalGroup(
            lineReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 5));

        resButton.setPreferredSize(new java.awt.Dimension(141, 45));
        resButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resButtonMouseExited(evt);
            }
        });

        reservas.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        reservas.setForeground(new java.awt.Color(82, 82, 82));
        reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_booking_45px.png"))); // NOI18N
        reservas.setText("         Reservas");

        javax.swing.GroupLayout resButtonLayout = new javax.swing.GroupLayout(resButton);
        resButton.setLayout(resButtonLayout);
        resButtonLayout.setHorizontalGroup(
            resButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(reservas)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        resButtonLayout.setVerticalGroup(
            resButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );

        sideSecPanel.add(resButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 320, 70));

        lineHospedagem.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout lineHospedagemLayout = new javax.swing.GroupLayout(lineHospedagem);
        lineHospedagem.setLayout(lineHospedagemLayout);
        lineHospedagemLayout.setHorizontalGroup(
            lineHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lineHospedagemLayout.setVerticalGroup(
            lineHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineHospedagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, -1, -1));

        hospButton.setPreferredSize(new java.awt.Dimension(320, 70));
        hospButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hospButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hospButtonMouseExited(evt);
            }
        });

        hospedagem.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        hospedagem.setForeground(new java.awt.Color(82, 82, 82));
        hospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hotel_check_in_45px.png"))); // NOI18N
        hospedagem.setText("         Hospedagem");

        javax.swing.GroupLayout hospButtonLayout = new javax.swing.GroupLayout(hospButton);
        hospButton.setLayout(hospButtonLayout);
        hospButtonLayout.setHorizontalGroup(
            hospButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(hospedagem)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        hospButtonLayout.setVerticalGroup(
            hospButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hospedagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideSecPanel.add(hospButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 320, -1));

        lineHospede.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout lineHospedeLayout = new javax.swing.GroupLayout(lineHospede);
        lineHospede.setLayout(lineHospedeLayout);
        lineHospedeLayout.setHorizontalGroup(
            lineHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lineHospedeLayout.setVerticalGroup(
            lineHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        HospedeButton.setPreferredSize(new java.awt.Dimension(320, 70));
        HospedeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HospedeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HospedeButtonMouseExited(evt);
            }
        });

        clients.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        clients.setForeground(new java.awt.Color(82, 82, 82));
        clients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clients.png"))); // NOI18N
        clients.setText("         Hospedes");

        javax.swing.GroupLayout HospedeButtonLayout = new javax.swing.GroupLayout(HospedeButton);
        HospedeButton.setLayout(HospedeButtonLayout);
        HospedeButtonLayout.setHorizontalGroup(
            HospedeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospedeButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(clients)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        HospedeButtonLayout.setVerticalGroup(
            HospedeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospedeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clients)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideSecPanel.add(HospedeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 320, -1));

        lineUsers.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout lineUsersLayout = new javax.swing.GroupLayout(lineUsers);
        lineUsers.setLayout(lineUsersLayout);
        lineUsersLayout.setHorizontalGroup(
            lineUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lineUsersLayout.setVerticalGroup(
            lineUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 375, -1, -1));

        userButton.setPreferredSize(new java.awt.Dimension(320, 70));
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userButtonMouseExited(evt);
            }
        });

        user.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        user.setForeground(new java.awt.Color(82, 82, 82));
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_45px_2.png"))); // NOI18N
        user.setText("          Users");

        javax.swing.GroupLayout userButtonLayout = new javax.swing.GroupLayout(userButton);
        userButton.setLayout(userButtonLayout);
        userButtonLayout.setHorizontalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButtonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        userButtonLayout.setVerticalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideSecPanel.add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 320, -1));

        jPanel12.setBackground(new java.awt.Color(82, 82, 82));
        jPanel12.setPreferredSize(new java.awt.Dimension(250, 165));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lockButton.setBackground(new java.awt.Color(82, 82, 82));
        lockButton.setForeground(new java.awt.Color(255, 255, 255));
        lockButton.setPreferredSize(new java.awt.Dimension(250, 55));
        lockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lockButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lockButtonMouseExited(evt);
            }
        });

        lock.setForeground(new java.awt.Color(245, 239, 239));
        lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_35px.png"))); // NOI18N
        lock.setText("            Lock");

        javax.swing.GroupLayout lockButtonLayout = new javax.swing.GroupLayout(lockButton);
        lockButton.setLayout(lockButtonLayout);
        lockButtonLayout.setHorizontalGroup(
            lockButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lockButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lock, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        lockButtonLayout.setVerticalGroup(
            lockButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lockButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lock)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.add(lockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        inButton.setBackground(new java.awt.Color(82, 82, 82));
        inButton.setForeground(new java.awt.Color(255, 255, 255));
        inButton.setPreferredSize(new java.awt.Dimension(141, 45));
        inButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inButtonMouseExited(evt);
            }
        });

        in.setForeground(new java.awt.Color(245, 239, 239));
        in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_import_35px.png"))); // NOI18N
        in.setText("           Sign in");

        javax.swing.GroupLayout inButtonLayout = new javax.swing.GroupLayout(inButton);
        inButton.setLayout(inButtonLayout);
        inButtonLayout.setHorizontalGroup(
            inButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inButtonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(in)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        inButtonLayout.setVerticalGroup(
            inButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inButtonLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(in))
        );

        jPanel12.add(inButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 240, 50));

        outButton.setBackground(new java.awt.Color(82, 82, 82));
        outButton.setForeground(new java.awt.Color(255, 255, 255));
        outButton.setPreferredSize(new java.awt.Dimension(250, 55));
        outButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outButtonMouseExited(evt);
            }
        });

        out.setForeground(new java.awt.Color(245, 239, 239));
        out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_export_35px_2.png"))); // NOI18N
        out.setText("          Sign out");

        javax.swing.GroupLayout outButtonLayout = new javax.swing.GroupLayout(outButton);
        outButton.setLayout(outButtonLayout);
        outButtonLayout.setHorizontalGroup(
            outButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(out)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        outButtonLayout.setVerticalGroup(
            outButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(out)
                .addContainerGap())
        );

        jPanel12.add(outButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_male_user_35px_1.png"))); // NOI18N
        jLabel7.setText("            Username");
        jPanel12.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 210, -1));

        sideSecPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 320, 220));

        sideFirstPanel.add(sideSecPanel, java.awt.BorderLayout.CENTER);

        footer.setPreferredSize(new java.awt.Dimension(350, 50));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        sideFirstPanel.add(footer, java.awt.BorderLayout.PAGE_END);

        jDesktopPane1.add(sideFirstPanel, java.awt.BorderLayout.LINE_START);

        jDesktopPane2.setBackground(new Color(0,0,0,1));
        jDesktopPane2.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(658, 50));

        data.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        data.setForeground(new java.awt.Color(86, 86, 86));
        data.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(593, Short.MAX_VALUE)
                .addComponent(data)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(data)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jDesktopPane2.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jDesktopPane1.add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        mainPanel.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_homeButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineHome,new Color(86,86,86));
        
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineHome,new Color(214, 217, 223));
    }//GEN-LAST:event_homeButtonMouseExited

    private void resButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineReservas,new Color(86,86,86));
    }//GEN-LAST:event_resButtonMouseEntered

    private void resButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineReservas,new Color(214, 217, 223));
    }//GEN-LAST:event_resButtonMouseExited

    private void hospButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineHospedagem,new Color(86,86,86));
    }//GEN-LAST:event_hospButtonMouseEntered

    private void hospButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineHospedagem,new Color(214, 217, 223));
    }//GEN-LAST:event_hospButtonMouseExited

    private void HospedeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospedeButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineHospede,new Color(86,86,86));
    }//GEN-LAST:event_HospedeButtonMouseEntered

    private void HospedeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospedeButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineHospede,new Color(214, 217, 223));
    }//GEN-LAST:event_HospedeButtonMouseExited

    private void userButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineUsers,new Color(86,86,86));
    }//GEN-LAST:event_userButtonMouseEntered

    private void userButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineUsers,new Color(214, 217, 223));
    }//GEN-LAST:event_userButtonMouseExited

    private void menuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseEntered
        // TODO add your handling code here:
       // menuButton.setBackground(new Color(86,86,86));
       // menu.setForeground(new Color(214, 217, 223));
      //  menu.setIcon(new Icon());
    }//GEN-LAST:event_menuButtonMouseEntered

    private void menuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseExited
        // TODO add your handling code here:
       // menuButton.setBackground(new Color(214, 217, 223));
       // menu.setForeground(new Color(86,86,86));
    }//GEN-LAST:event_menuButtonMouseExited

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        /*
        if(a==true){
            hideShowMenu(sideFirstPanel,a);
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }else{
            hideShowMenu(sideFirstPanel,a);
            SwingUtilities.updateComponentTreeUI(this);
           // HideMenu.setBackground(new Color(7,10,55));
            a=true;
        }
       */
    }//GEN-LAST:event_menuButtonMouseClicked

    private void inButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(inButton,new Color(179, 181, 183));
        
    }//GEN-LAST:event_inButtonMouseEntered

    private void inButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inButtonMouseExited
        ChangeColor(inButton,new Color(82, 82, 82));
    }//GEN-LAST:event_inButtonMouseExited

    private void outButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outButtonMouseEntered
        ChangeColor(outButton,new Color(179, 181, 183));
    }//GEN-LAST:event_outButtonMouseEntered

    private void outButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outButtonMouseExited
        ChangeColor(outButton,new Color(82, 82, 82));
    }//GEN-LAST:event_outButtonMouseExited

    private void lockButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lockButtonMouseEntered
        ChangeColor(lockButton,new Color(179, 181, 183));
    }//GEN-LAST:event_lockButtonMouseEntered

    private void lockButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lockButtonMouseExited
        ChangeColor(lockButton,new Color(82, 82, 82));
    }//GEN-LAST:event_lockButtonMouseExited

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        ChangeColor(exitButton,new Color(179, 181, 183));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        ChangeColor(exitButton,new Color(82, 82, 82));
    }//GEN-LAST:event_exitButtonMouseExited

    
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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HospedeButton;
    private javax.swing.JLabel clients;
    private javax.swing.JLabel data;
    private javax.swing.JPanel exitButton;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel home;
    private javax.swing.JPanel homeButton;
    private javax.swing.JPanel hospButton;
    private javax.swing.JLabel hospedagem;
    private javax.swing.JLabel in;
    private javax.swing.JPanel inButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel lineHome;
    private javax.swing.JPanel lineHospedagem;
    private javax.swing.JPanel lineHospede;
    private javax.swing.JPanel lineReservas;
    private javax.swing.JPanel lineUsers;
    private javax.swing.JLabel lock;
    private javax.swing.JPanel lockButton;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logoName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel menuButton;
    private javax.swing.JLabel out;
    private javax.swing.JPanel outButton;
    private javax.swing.JPanel resButton;
    private javax.swing.JLabel reservas;
    private javax.swing.JPanel sideFirstPanel;
    private javax.swing.JPanel sideSecPanel;
    private javax.swing.JPanel subHeader;
    private javax.swing.JLabel user;
    private javax.swing.JPanel userButton;
    // End of variables declaration//GEN-END:variables
}
