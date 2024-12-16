package aplikasi;

import method.Control;
import entity.Entitas;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import method.Control;
import java.sql.Connection;
import java.sql.Statement;
import entity.Entitas;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

public class FormTransaksi extends javax.swing.JFrame {
    
     int x=0;
        private DefaultTableModel model;
        Control bc=new Control();
        Entitas eb=new Entitas();
        List <Entitas> listBarang=new ArrayList<Entitas>();
    
    Statement stm;
    Connection Con;
    private double total;
    DefaultTableModel tableModel = new DefaultTableModel(
    new Object [ ][ ] {},
    new String [ ] {
    "Kd Barang", "Nama Barang","Harga Barang","Jumlah","Total"
    });
    private int row;
    private String tanggal;

    public FormTransaksi() {
        initComponents();
        bersih();
        siapIsi(false);
        aktif(false);
        setTombol(true);
        setLocationRelativeTo(this);
        txttanggal.setEditor(new JSpinner.DateEditor(txttanggal,"yyyy/MM/dd"));
        isi_combobrg();
        inisialisasi_tabel();
        open_db();
    }
   
    private void bersih(){
    txtnojual.setText(null);
    txtnm_brg.setText(null);
      txtjumlah.setText(null);
      txtharga.setText(null);  
      txttot.setText(null);
    }

    private void siapIsi(boolean a){
    txtnojual.setEnabled(a);
        
    }
    
    private void buatNoJual(){
        listBarang=bc.tampil();
        int a=listBarang.size()-1;
        int no=Integer.parseInt(listBarang.get(a).getNojual().replace("NOTA-", ""))+1;
        txtnojual.setText("NOTA-"+no);
        txtnojual.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnojual = new javax.swing.JTextField();
        txttanggal = new javax.swing.JSpinner();
        bttambah = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtshowharga = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbkdbrg = new javax.swing.JComboBox();
        txtnm_brg = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txttot = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btsimpanitem = new javax.swing.JButton();
        bthapusitem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbljual = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtkembali = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btsimpan = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        btRiwayatTransaksi = new javax.swing.JButton();
        btDaftarBarang = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Transaksi");

        jPanel1.setBackground(new java.awt.Color(143, 176, 219));

        jLabel1.setText("No Jual");

        jLabel2.setText("Tanggal");

        txtnojual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnojualActionPerformed(evt);
            }
        });

        txttanggal.setModel(new javax.swing.SpinnerDateModel());

        bttambah.setText("Tambah");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txtshowharga.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        txtshowharga.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(txtshowharga)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtshowharga))
        );

        jLabel11.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtnojual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttambah)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnojual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttambah)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        cmbkdbrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kode Barang" }));
        cmbkdbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkdbrgActionPerformed(evt);
            }
        });

        txtnm_brg.setEditable(false);

        txtharga.setEditable(false);
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        txttot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotActionPerformed(evt);
            }
        });
        txttot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttotKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Data Barang");

        btsimpanitem.setText("Tambah Item");
        btsimpanitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanitemActionPerformed(evt);
            }
        });

        bthapusitem.setText("Hapus Item");
        bthapusitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusitemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Jumlah");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel12.setText("*tekan enter");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel13.setText("*tekan enter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbkdbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnm_brg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsimpanitem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bthapusitem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbkdbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnm_brg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsimpanitem)
                    .addComponent(bthapusitem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbljual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbljual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbljualMouseClicked(evt);
            }
        });
        tbljual.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbljualAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbljual);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Detail Barang");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(143, 176, 219));

        txtkembali.setEditable(false);
        txtkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembaliActionPerformed(evt);
            }
        });
        txtkembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkembaliKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Kembalian");

        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbayarKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Bayar");

        Total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Total.setText("Total");

        txttotal.setEditable(false);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        txttotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttotalKeyReleased(evt);
            }
        });

        btsimpan.setText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        btRiwayatTransaksi.setText("RIWAYAT TRANSAKSI");
        btRiwayatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRiwayatTransaksiActionPerformed(evt);
            }
        });

        btDaftarBarang.setText("DAFTAR BARANG");
        btDaftarBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDaftarBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRiwayatTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(btDaftarBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(580, 580, 580)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(Total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txttotal))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btRiwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsimpan)
                            .addComponent(btkeluar)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(143, 176, 219));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Transaksi Penjualan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Toko Ilham");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(391, 391, 391))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btkeluarActionPerformed

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
    
    if(bttambah.getText().equalsIgnoreCase("tambah")){
            bttambah.setText("Batal");
            bersih();
            siapIsi(true);
            buatNoJual();
           
            bttambah.setEnabled(true);
            
        } else{
            bttambah.setText("Tambah");
            bersih();
            siapIsi(true);
           
        }
        
    aktif(true);
    setTombol(true);
    
    }//GEN-LAST:event_bttambahActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void cmbkdbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkdbrgActionPerformed
        data_barang(); // TODO add your handling code here:
    }//GEN-LAST:event_cmbkdbrgActionPerformed

    private void btsimpanitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanitemActionPerformed
        simpan_ditabel();        
        
    }//GEN-LAST:event_btsimpanitemActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        try{
            open_db();
            int xidjual = 0;
            String xnojual=txtnojual.getText();
            format_tanggal(); 
            String xbrg =txtnm_brg.getText();
            String xjumlh=txtjumlah.getText();
            String xtotal=txttotal.getText();
            String xkd = cmbkdbrg.getSelectedItem().toString();
            String msql="insert into jual values('"+xidjual+"','"+xnojual+"','"+tanggal+"','"+xkd+"','"+xbrg+"','"+xjumlh+"','"+xtotal+"')";
            stm.executeUpdate(msql);

            //Con.close();
            JOptionPane.showMessageDialog(null,"Transaksi tersimpan sukses");   
            setTombol(true);
            txtnojual.setText("");
            txtnm_brg.setText("");
            txtharga.setText("0");
            txtjumlah.setText("0");
            txttot.setText("0");
            txttotal.setText("0");
            txtbayar.setText("0");
            txtkembali.setText("0");
            txtshowharga.setText("0");
            tbljual.clearSelection();
            tableModel.removeRow(row);
        }
        catch(SQLException e)
        {
            System.out.println("Error : "+e);
            JOptionPane.showMessageDialog(null,"Transaksi gagal tersimpan");
            setTombol(false);
            txtnojual.setText("");
            txtnm_brg.setText("");
            txtharga.setText("0");
            txtjumlah.setText("0");
            txttot.setText("0");
            txttotal.setText("0");
            txtbayar.setText("0");
            txtkembali.setText("0");
            txtshowharga.setText("0");
            tbljual.clearSelection();
            tableModel.removeRow(row);
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bthapusitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusitemActionPerformed
        tableModel.removeRow(row);
        total_harga();
        // TODO add your handling code here:
    }//GEN-LAST:event_bthapusitemActionPerformed

    private void txttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotActionPerformed
 hitung_jual();        // TODO add your handling code here:
    }//GEN-LAST:event_txttotActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
     double xtot,xhrg,xjml;
    xhrg=Double.parseDouble(txttotal.getText());
    xjml=Double.parseDouble(txtbayar.getText());
    xtot=xjml-xhrg;
    String xtotal=Double.toString(xtot);
    txtkembali.setText(xtotal);   // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txttotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalKeyReleased
if (evt.getKeyCode() == 10){
     txtbayar.requestFocus();}
         // TODO add your handling code here:
    }//GEN-LAST:event_txttotalKeyReleased

    private void txtbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyReleased
if (evt.getKeyCode() == 10){
     txtkembali.requestFocus();}

         // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarKeyReleased

    private void txtkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembaliActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtkembaliActionPerformed

    private void txtkembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkembaliKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkembaliKeyReleased

    private void txtnojualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnojualActionPerformed
    int no,x,y;
    x=00000000;
    y=1;
    no=x+y;
    String nojual=Integer.toString(no);
    txtnojual.setText(nojual);// TODO add your handling code here:
    }//GEN-LAST:event_txtnojualActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        double xtot,xhrg,xjml;
        xhrg=Double.parseDouble(txtharga.getText());
        xjml=Double.parseDouble(txtjumlah.getText());
        xtot=xjml*xhrg;
        String xsubtotal=Double.toString(xtot);
        txttot.setText(xsubtotal);
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void txttotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotKeyReleased
        if (evt.getKeyCode() == 10){
            txttot.requestFocus();}
    }//GEN-LAST:event_txttotKeyReleased

    private void tbljualAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbljualAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbljualAncestorAdded

    private void tbljualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbljualMouseClicked
        if (evt.getClickCount() ==1){
            // tampil();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tbljualMouseClicked

    private void btRiwayatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRiwayatTransaksiActionPerformed
        new FormHistory().setVisible(true);
    }//GEN-LAST:event_btRiwayatTransaksiActionPerformed

    private void btDaftarBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDaftarBarangActionPerformed
        // Ke Daftar Barang
        new FormBarang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDaftarBarangActionPerformed
 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JButton btDaftarBarang;
    private javax.swing.JButton btRiwayatTransaksi;
    private javax.swing.JButton bthapusitem;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton btsimpanitem;
    private javax.swing.JButton bttambah;
    private javax.swing.JComboBox cmbkdbrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbljual;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkembali;
    private javax.swing.JTextField txtnm_brg;
    private javax.swing.JTextField txtnojual;
    private javax.swing.JLabel txtshowharga;
    private javax.swing.JSpinner txttanggal;
    private javax.swing.JTextField txttot;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private void aktif(boolean x) {
      txtnojual.setEditable(x);
      txttanggal.setEnabled(x);
      cmbkdbrg.setEnabled(x);
      txtnm_brg.setEnabled(x);
      txtjumlah.setEditable(x);
      txtharga.setEnabled(x);      
      txttotal.setEnabled(x);
    }

    private void setTombol(boolean t) {
    bttambah.setEnabled(t);
     btsimpan.setEnabled(t); 
     btsimpanitem.setEnabled(t);
     bthapusitem.setEnabled(t);
    }

    private void open_db() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_transaksi","root","");
            stm = (Statement) Con.createStatement();

        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }

    private void inisialisasi_tabel() {
        tbljual.setModel(tableModel);
    }

    private void hitung_jual() {
        double xtot,xhrg;
        int xjml;
        xhrg=Double.parseDouble(txtharga.getText());
        xjml=Integer.parseInt(txtjumlah.getText());
        xtot=xhrg*xjml;
        String xtotal=Double.toString(xtot);
        txttot.setText(xtotal);
        total=total+xtot;
        txttotal.setText(Double.toString(total));
        txtshowharga.setText(Double.toString(total));    
    }

   

    private void isi_combobrg() {
        try{
        open_db();
        String sql = "Select * from tblbrg";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
        {
        cmbkdbrg.addItem(rs.getString(1)); 
        }
        } catch (Exception e){}
    }

    private void total_harga() {
        double tothrg = 0;
        int jumrec = tbljual.getRowCount();
        for (int i=0;i<jumrec;i++)
        {
        tothrg = tothrg + Double.parseDouble(tableModel.getValueAt(i,4).toString()); }
        txttotal.setText(String.valueOf(tothrg)); 
    }

    private void simpan_ditabel() {
        try{
            String tKode=cmbkdbrg.getSelectedItem().toString();
            String tNama=txtnm_brg.getText();
            double hrg=Double.parseDouble(txtharga.getText());
            int jml=Integer.parseInt(txtjumlah.getText());
            double tot=Double.parseDouble(txttot.getText());
            tableModel.addRow(new Object[]{tKode,tNama,hrg,jml,tot});
            inisialisasi_tabel();
        }
        
            catch(Exception e)
        {
        System.out.println("Error : "+e);
        }
    }

    private void format_tanggal() {
        String DATE_FORMAT = "yyyy-MM-dd";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
        Calendar c1 = Calendar.getInstance();
        int year=c1.get(Calendar.YEAR);
        int month=c1.get(Calendar.MONTH)+1;
        int day=c1.get(Calendar.DAY_OF_MONTH);
        tanggal=Integer.toString(year)+"-"+Integer.toString(month)+"-"+Integer.toString(day);
    }


    private void data_barang() {
        try{
            stm =    (Statement) Con.createStatement();
                ResultSet rs=stm.executeQuery("select * from tblbrg where kode_barang='"+ cmbkdbrg.getSelectedItem()+"'");
                rs.beforeFirst();
                while(rs.next())
            {
                txtnm_brg.setText(rs.getString(2).trim());
                txtharga.setText(Double.toString((Double)rs.getDouble(4)));
                txtjumlah.requestFocus();
            }
                rs.close();
            }
        catch(SQLException e)
            {
                System.out.println("Error : "+e);
            }
        }
    }