-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.62 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5151
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for book_shop
CREATE DATABASE IF NOT EXISTS `book_shop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `book_shop`;

-- Dumping structure for table book_shop.cash_register
CREATE TABLE IF NOT EXISTS `cash_register` (
  `id` varchar(15) NOT NULL,
  `open_date` date DEFAULT NULL,
  `open_time` time DEFAULT NULL,
  `openning_balance` double NOT NULL DEFAULT '0',
  `total_cash_sales` double NOT NULL DEFAULT '0',
  `total_card_sales` double NOT NULL DEFAULT '0',
  `total_sales_returns` double NOT NULL DEFAULT '0',
  `closing_balance` double NOT NULL DEFAULT '0',
  `closed_date` date DEFAULT NULL,
  `closed_time` time DEFAULT NULL,
  `user` varchar(25) NOT NULL DEFAULT '0',
  `status` varchar(6) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.cash_register: ~6 rows (approximately)
/*!40000 ALTER TABLE `cash_register` DISABLE KEYS */;
INSERT INTO `cash_register` (`id`, `open_date`, `open_time`, `openning_balance`, `total_cash_sales`, `total_card_sales`, `total_sales_returns`, `closing_balance`, `closed_date`, `closed_time`, `user`, `status`) VALUES
	('CR20180001', '2018-11-05', '18:45:13', 0, 0, 0, 0, 0, NULL, NULL, 'Pasindu Kalubowila', 'Open'),
	('CR20190001', '2019-05-30', '10:11:40', 1000, 6550, 0, 115, 7435, '2019-05-30', '20:32:01', 'Kanishka Viraj', 'Closed'),
	('CR20190002', '2019-05-30', '20:34:37', 1500, 0, 0, 450, 1050, '2019-05-30', '20:49:30', 'Kanishka Viraj', 'Closed'),
	('CR20190003', '2019-05-30', '11:57:59', 1500, 3110, 0, 0, 4610, '2019-05-30', '18:40:30', 'Kanishka Viraj', 'Closed'),
	('CR20190004', '2019-05-30', '18:41:18', 1000, 2450, 0, 110, 3340, '2019-06-27', '21:47:28', 'Kanishka Viraj', 'Closed'),
	('CR20190005', '2019-06-27', '21:48:03', 1000, 0, 0, 0, 0, NULL, NULL, 'Kanishka Viraj', 'Open');
/*!40000 ALTER TABLE `cash_register` ENABLE KEYS */;

-- Dumping structure for table book_shop.cheque_payment
CREATE TABLE IF NOT EXISTS `cheque_payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_payment` varchar(20) NOT NULL DEFAULT '0',
  `bank` varchar(50) NOT NULL DEFAULT '0',
  `chq_no` varchar(8) NOT NULL DEFAULT '0',
  `chq_date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cheque_payment_supplier_payment` (`id_payment`),
  CONSTRAINT `FK_cheque_payment_supplier_payment` FOREIGN KEY (`id_payment`) REFERENCES `supplier_payment` (`id_payment`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.cheque_payment: ~3 rows (approximately)
/*!40000 ALTER TABLE `cheque_payment` DISABLE KEYS */;
INSERT INTO `cheque_payment` (`id`, `id_payment`, `bank`, `chq_no`, `chq_date`) VALUES
	(1, 'ITP0000001', 'Sampath Bank PLC', '012653', '2019-05-31'),
	(2, 'ITP0000002', 'Sampath', '01245', '2019-06-30'),
	(3, 'ITP0000003', 'NDB', '5464654', '2019-06-30');
/*!40000 ALTER TABLE `cheque_payment` ENABLE KEYS */;

-- Dumping structure for table book_shop.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id_customer` varchar(15) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `nic` varchar(15) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` char(12) NOT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `state` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.customer: ~3 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id_customer`, `fname`, `lname`, `gender`, `nic`, `company`, `email`, `mobile`, `street`, `city`, `state`) VALUES
	('000001', 'Dafault', 'Customer', 'Male', '', 'Chamara Book Shop', '', '0382255887', 'Kesbewa Road', 'Bandaragama', 1),
	('000002', 'Kanishka', 'Viraj', 'Male', '953324377v', 'Food City', 'bestkvl@gmail.com', '0774072278', 'Lake Road', 'Bandaragama', 1),
	('000003', 'Nilupulee', 'Wathsala1', 'Female', '953324378v', '', '', '0774072279', '', 'Horana', 1);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Dumping structure for table book_shop.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id_employee` varchar(15) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `mName` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `dob` varchar(50) DEFAULT NULL,
  `nic` varchar(13) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `state` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_employee`),
  UNIQUE KEY `nic_UNIQUE` (`nic`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.employee: ~4 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id_employee`, `fname`, `mName`, `lname`, `gender`, `dob`, `nic`, `email`, `mobile`, `street`, `city`, `state`) VALUES
	('0001', 'kanishka', '', 'viraj', 'Male', '1995-11-27', '953324377v', 'bestkvl@gmail.com', '0774072278', '', 'Bandaragama', 1),
	('0002', 'kanishka', 'viraj', '4', 'Male', '2002-06-12', '953324379v', '', '', '', '', 1),
	('0003', 'kanishka', 'viraj', '2', 'Male', '2019-06-10', '953324380v', '', '', '', '', 1),
	('0004', 'kanishka', 'viraj', '3', 'Male', '2019-06-01', '953324381v', '', '', '', '', 1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

-- Dumping structure for table book_shop.grn
CREATE TABLE IF NOT EXISTS `grn` (
  `grn_no` varchar(15) NOT NULL,
  `id_supplier` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `value` double DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`grn_no`),
  KEY `fk_grn_supplier1_idx` (`id_supplier`),
  CONSTRAINT `fk_grn_supplier1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.grn: ~7 rows (approximately)
/*!40000 ALTER TABLE `grn` DISABLE KEYS */;
INSERT INTO `grn` (`grn_no`, `id_supplier`, `date`, `value`, `state`) VALUES
	('GRN000001', 'IS000001', '2019-07-05', 708750, 1),
	('GRN000002', 'IS000003', '2019-06-04', 270000, 1),
	('GRN000003', 'IS000001', '2019-06-04', 38500, 1),
	('GRN000004', 'IS000002', '2019-06-04', 90000, 1),
	('GRN000005', 'IS000001', '2019-06-27', 52500, 1),
	('GRN000006', 'IS000002', '2019-06-28', 19000, 1),
	('GRN000007', 'IS000001', '2019-06-28', 540, 1);
/*!40000 ALTER TABLE `grn` ENABLE KEYS */;

-- Dumping structure for table book_shop.grn_item
CREATE TABLE IF NOT EXISTS `grn_item` (
  `id_grn_item` int(11) NOT NULL AUTO_INCREMENT,
  `grn_no` varchar(15) NOT NULL,
  `id_product` varchar(15) NOT NULL,
  `qty` double DEFAULT NULL,
  `buying_price` double DEFAULT NULL,
  `retail_price` double DEFAULT NULL,
  PRIMARY KEY (`id_grn_item`),
  KEY `fk_grn_item_grn1_idx` (`grn_no`),
  KEY `fk_grn_item_product1_idx` (`id_product`),
  CONSTRAINT `fk_grn_item_grn1` FOREIGN KEY (`grn_no`) REFERENCES `grn` (`grn_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_grn_item_product1` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.grn_item: ~8 rows (approximately)
/*!40000 ALTER TABLE `grn_item` DISABLE KEYS */;
INSERT INTO `grn_item` (`id_grn_item`, `grn_no`, `id_product`, `qty`, `buying_price`, `retail_price`) VALUES
	(1, 'GRN000001', '0254698', 25, 25850, 30000),
	(2, 'GRN000001', '0125364', 50, 1250, 1500),
	(3, 'GRN000001', '785423695', 600, 105, 115),
	(4, 'GRN000002', '0124575555', 3000, 90, 110),
	(5, 'GRN000003', '01254585879', 100, 385, 450),
	(6, 'GRN000004', '45789658', 1000, 90, 135),
	(7, 'GRN000005', '0124575555', 1500, 35, 55),
	(8, 'GRN000007', '012458658', 45, 12, 15);
/*!40000 ALTER TABLE `grn_item` ENABLE KEYS */;

-- Dumping structure for table book_shop.invoice
CREATE TABLE IF NOT EXISTS `invoice` (
  `id_invoice` varchar(15) NOT NULL,
  `id_customer` varchar(15) NOT NULL,
  `payment_type` varchar(6) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `net_total` double DEFAULT NULL,
  `paid_amount` double DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `state` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id_invoice`),
  KEY `fk_invoice_customer1_idx` (`id_customer`),
  CONSTRAINT `fk_invoice_customer1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.invoice: ~3 rows (approximately)
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` (`id_invoice`, `id_customer`, `payment_type`, `subtotal`, `discount`, `net_total`, `paid_amount`, `balance`, `date`, `time`, `state`) VALUES
	('201906-00000001', '000002', 'Cash', 730, 5, 693.5, 800, 106.5, '2019-06-27', '23:32:21', 1),
	('201906-00000002', '000002', 'Cash', 1420, 0, 1420, 0, 0, '2019-06-29', '00:22:03', 1),
	('201906-00000003', '000003', 'Cash', 330, 2, 323.4, 1000, 670, '2019-06-29', '00:23:06', 1);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;

-- Dumping structure for table book_shop.invoice_item
CREATE TABLE IF NOT EXISTS `invoice_item` (
  `id_orderitem` int(11) NOT NULL AUTO_INCREMENT,
  `id_invoice` varchar(15) NOT NULL,
  `idproduct_stock` varchar(15) NOT NULL,
  `unit` varchar(12) NOT NULL,
  `qty` double DEFAULT NULL,
  `value` double DEFAULT NULL,
  PRIMARY KEY (`id_orderitem`),
  KEY `fk_invoice_item_product_stock1_idx` (`idproduct_stock`),
  KEY `fk_order_item_invoice1_idx` (`id_invoice`),
  CONSTRAINT `FK_invoice_item_product_stock` FOREIGN KEY (`idproduct_stock`) REFERENCES `product_stock` (`idproduct_stock`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_item_invoice1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice` (`id_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.invoice_item: ~6 rows (approximately)
/*!40000 ALTER TABLE `invoice_item` DISABLE KEYS */;
INSERT INTO `invoice_item` (`id_orderitem`, `id_invoice`, `idproduct_stock`, `unit`, `qty`, `value`) VALUES
	(8, '201906-00000001', 'ITS0000001', 'NOS', 5, 500),
	(9, '201906-00000001', 'ITS0000003', 'NOS', 2, 230),
	(10, '201906-00000002', 'ITS0000004', 'NOS', 12, 1320),
	(11, '201906-00000002', 'ITS0000001', 'NOS', 1, 100),
	(12, '201906-00000003', 'ITS0000001', 'NOS', 1, 100),
	(13, '201906-00000003', 'ITS0000003', 'NOS', 2, 230);
/*!40000 ALTER TABLE `invoice_item` ENABLE KEYS */;

-- Dumping structure for table book_shop.payble_grn
CREATE TABLE IF NOT EXISTS `payble_grn` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grn_no` varchar(15) NOT NULL,
  `grn_value` double NOT NULL,
  `paid_amount` double NOT NULL DEFAULT '0',
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_payyble_grns_grn` (`grn_no`),
  CONSTRAINT `FK_payyble_grns_grn` FOREIGN KEY (`grn_no`) REFERENCES `grn` (`grn_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.payble_grn: ~1 rows (approximately)
/*!40000 ALTER TABLE `payble_grn` DISABLE KEYS */;
INSERT INTO `payble_grn` (`id`, `grn_no`, `grn_value`, `paid_amount`, `balance`) VALUES
	(9, 'GRN000007', 540, 500, 40);
/*!40000 ALTER TABLE `payble_grn` ENABLE KEYS */;

-- Dumping structure for view book_shop.payble_payments
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `payble_payments` (
	`grn_no` VARCHAR(15) NOT NULL COLLATE 'utf8_general_ci',
	`id_supplier` VARCHAR(15) NOT NULL COLLATE 'utf8_general_ci',
	`date` DATE NULL,
	`value` DOUBLE NULL,
	`paid_amount` DOUBLE NOT NULL,
	`balance` DOUBLE NULL
) ENGINE=MyISAM;

-- Dumping structure for table book_shop.payment_items
CREATE TABLE IF NOT EXISTS `payment_items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_payment` varchar(20) NOT NULL DEFAULT '0',
  `id_grn` varchar(15) NOT NULL DEFAULT '0',
  `paid_amount` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_paid_grn_grn` (`id_grn`),
  KEY `FK_payment_items_supplier_payment` (`id_payment`),
  CONSTRAINT `FK_paid_grn_grn` FOREIGN KEY (`id_grn`) REFERENCES `grn` (`grn_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_payment_items_supplier_payment` FOREIGN KEY (`id_payment`) REFERENCES `supplier_payment` (`id_payment`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.payment_items: ~11 rows (approximately)
/*!40000 ALTER TABLE `payment_items` DISABLE KEYS */;
INSERT INTO `payment_items` (`id`, `id_payment`, `id_grn`, `paid_amount`) VALUES
	(1, 'ITP0000001', 'GRN000001', 708750),
	(2, 'ITP0000002', 'GRN000001', 10000),
	(3, 'ITP0000002', 'GRN000004', 1000),
	(4, 'ITP0000003', 'GRN000007', 300),
	(5, 'ITP0000004', 'GRN000007', 240),
	(6, 'ITP0000005', 'GRN000007', 240),
	(7, 'ITP0000006', 'GRN000007', 200),
	(8, 'ITP0000007', 'GRN000007', 200),
	(9, 'ITP0000008', 'GRN000007', 300),
	(10, 'ITP0000009', 'GRN000007', 100),
	(11, 'ITP0000011', 'GRN000007', 40);
/*!40000 ALTER TABLE `payment_items` ENABLE KEYS */;

-- Dumping structure for table book_shop.product
CREATE TABLE IF NOT EXISTS `product` (
  `id_product` varchar(15) NOT NULL,
  `product_brand` varchar(15) NOT NULL,
  `product_type` varchar(15) NOT NULL,
  `productname` varchar(80) DEFAULT NULL,
  `unit` varchar(15) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `state` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`id_product`),
  KEY `fk_product_product_type1_idx` (`product_type`),
  KEY `fk_product_product_brand1_idx` (`product_brand`),
  CONSTRAINT `FK_product_product_brand` FOREIGN KEY (`product_brand`) REFERENCES `product_brand` (`id`) ON UPDATE NO ACTION,
  CONSTRAINT `FK_product_product_type` FOREIGN KEY (`product_type`) REFERENCES `product_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.product: ~9 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id_product`, `product_brand`, `product_type`, `productname`, `unit`, `description`, `state`) VALUES
	('0124575555', 'ITB0002', 'ITC0002', 'Sammanee Ex Book 120pg Square Rule', 'NOS', 'Sammanee Ex Book 120pg Square Rule', 1),
	('01245865', 'ITB0001', 'ITC0001', 'Blue Pen', 'NOS', 'ghejche', 1),
	('012458658', 'ITB0001', 'ITC0001', 'Atlas CR Book 80pg Single Rule', 'NOS', 'Atlas CR Book 80pg Single Rule', 1),
	('0125364', 'ITB0001', 'ITC0002', ' Kingston -  Pen Drives', 'NOS', '', 1),
	('01254585879', 'ITB0001', 'ITC0004', 'A4 Bundle 80gsm', 'NOS', 'A4 Bundle 80gsm 500pcs', 1),
	('0254698', 'ITB0002', 'ITC0003', ' Asus -  VGA Cards GTX 940MX', 'NOS', ' Asus -  VGA Cards GTX 940MX', 1),
	('45789658', 'ITB0001', 'ITC0001', 'Atlas CR Book 120pg Single Rule', 'NOS', 'Atlas CR Book 120pg Single Rule', 1),
	('785423695', 'ITB0001', 'ITC0001', 'Atlas CR Book 120pg Square Rule', 'NOS', 'Atlas CR Book 120pg Square Rule', 1),
	('aasd', 'ITB0002', 'ITC0003', '3Colour pen', 'NOS', '', 1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table book_shop.product_brand
CREATE TABLE IF NOT EXISTS `product_brand` (
  `id` varchar(15) NOT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.product_brand: ~5 rows (approximately)
/*!40000 ALTER TABLE `product_brand` DISABLE KEYS */;
INSERT INTO `product_brand` (`id`, `brand`, `description`) VALUES
	('ITB0001', 'Kingston', 'All Kingston Products from china'),
	('ITB0002', 'Asus', 'Asus Products'),
	('ITB0003', 'HP', 'HP products'),
	('ITB0004', 'Dumindu', 'Dumindu Books Pvt Ltd'),
	('ITB0005', 'Promate', 'Promate Stationery Pvt Ltd');
/*!40000 ALTER TABLE `product_brand` ENABLE KEYS */;

-- Dumping structure for table book_shop.product_stock
CREATE TABLE IF NOT EXISTS `product_stock` (
  `idproduct_stock` varchar(15) NOT NULL,
  `id_product` varchar(15) NOT NULL,
  `unit` varchar(12) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `retail_price` double DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idproduct_stock`,`id_product`),
  KEY `fk_product_stock_product1_idx` (`id_product`),
  CONSTRAINT `fk_product_stock_product1` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.product_stock: ~10 rows (approximately)
/*!40000 ALTER TABLE `product_stock` DISABLE KEYS */;
INSERT INTO `product_stock` (`idproduct_stock`, `id_product`, `unit`, `qty`, `retail_price`, `created_date`) VALUES
	('ITS0000001', '012458658', 'NOS', 1194, 100, '2019-06-29 00:38:55'),
	('ITS0000001', '0254698', 'NOS', 21, 30000, '2019-06-29 00:38:55'),
	('ITS0000002', '0125364', 'NOS', 34, 1500, '2019-06-24 20:27:57'),
	('ITS0000002', '45789658', 'NOS', 1491, 115, '2019-06-30 10:21:18'),
	('ITS0000003', '785423695', 'NOS', 597, 115, '2019-06-29 00:38:55'),
	('ITS0000004', '0124575555', 'NOS', 2963, 110, '2019-06-29 00:22:03'),
	('ITS0000005', '01254585879', 'NOS', 89, 450, '2019-06-30 20:35:18'),
	('ITS0000006', '45789658', 'NOS', 980, 135, '2019-06-28 18:42:17'),
	('ITS0000007', '0124575555', 'NOS', 1500, 55, '2019-06-29 18:47:21'),
	('ITS0000010', '012458658', '', 45, 15, '2019-06-28 23:24:32');
/*!40000 ALTER TABLE `product_stock` ENABLE KEYS */;

-- Dumping structure for table book_shop.product_type
CREATE TABLE IF NOT EXISTS `product_type` (
  `id` varchar(15) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.product_type: ~6 rows (approximately)
/*!40000 ALTER TABLE `product_type` DISABLE KEYS */;
INSERT INTO `product_type` (`id`, `type`, `description`) VALUES
	('ITC0001', 'Monitors', 'Monitors 17inch 19 inch '),
	('ITC0002', 'Pen Drives', 'Pen Drives All types'),
	('ITC0003', 'VGA Cards', 'Video Grafic Adupters Cards'),
	('ITC0004', 'Mouse', 'Mouse Types'),
	('ITC0005', 'KeyBoards', 'KeyBoards Full Size'),
	('ITC0006', 'Pens', 'vdcj');
/*!40000 ALTER TABLE `product_type` ENABLE KEYS */;

-- Dumping structure for table book_shop.sales_return
CREATE TABLE IF NOT EXISTS `sales_return` (
  `id_srn` varchar(15) NOT NULL,
  `id_invoice` varchar(15) NOT NULL,
  `date_created` date DEFAULT NULL,
  `time_created` time DEFAULT NULL,
  `value` double DEFAULT NULL,
  PRIMARY KEY (`id_srn`),
  KEY `fk_sales_return_invoice1_idx` (`id_invoice`),
  CONSTRAINT `fk_sales_return_invoice1` FOREIGN KEY (`id_invoice`) REFERENCES `invoice` (`id_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.sales_return: ~0 rows (approximately)
/*!40000 ALTER TABLE `sales_return` DISABLE KEYS */;
INSERT INTO `sales_return` (`id_srn`, `id_invoice`, `date_created`, `time_created`, `value`) VALUES
	('SRN000001', '201906-00000003', '2019-06-29', '00:38:55', 215);
/*!40000 ALTER TABLE `sales_return` ENABLE KEYS */;

-- Dumping structure for table book_shop.sales_return_items
CREATE TABLE IF NOT EXISTS `sales_return_items` (
  `id_return_items` int(11) NOT NULL AUTO_INCREMENT,
  `id_srn` varchar(15) NOT NULL,
  `id_stock` varchar(15) DEFAULT NULL,
  `unit` varchar(12) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `value` double DEFAULT NULL,
  PRIMARY KEY (`id_return_items`),
  KEY `fk_sales_return_items_sales_return1_idx` (`id_srn`),
  KEY `FK_sales_return_items_product_stock` (`id_stock`),
  CONSTRAINT `FK_sales_return_items_product_stock` FOREIGN KEY (`id_stock`) REFERENCES `product_stock` (`idproduct_stock`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sales_return_items_sales_return1` FOREIGN KEY (`id_srn`) REFERENCES `sales_return` (`id_srn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.sales_return_items: ~0 rows (approximately)
/*!40000 ALTER TABLE `sales_return_items` DISABLE KEYS */;
INSERT INTO `sales_return_items` (`id_return_items`, `id_srn`, `id_stock`, `unit`, `qty`, `value`) VALUES
	(4, 'SRN000001', 'ITS0000001', 'NOS', 1, 100),
	(5, 'SRN000001', 'ITS0000003', 'NOS', 1, 115);
/*!40000 ALTER TABLE `sales_return_items` ENABLE KEYS */;

-- Dumping structure for table book_shop.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `id_supplier` varchar(15) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `nic` varchar(12) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` varchar(12) DEFAULT NULL,
  `fax` varchar(12) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `state` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.supplier: ~3 rows (approximately)
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`id_supplier`, `fname`, `lname`, `nic`, `company`, `email`, `mobile`, `fax`, `street`, `city`, `state`) VALUES
	('IS000001', '', '', '', 'Asus Sri Lanka Pvt Ltd', '', '', '', '', '', 1),
	('IS000002', 'Leader Distributors Pvt Ltd', '', '', '', '', '094114820821', '', '', 'Pokunuwita', 1),
	('IS000003', '', '', '', 'Perera Distributors Pvt Ltd', '', '0124586586', '', '', 'Panadura', 1);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

-- Dumping structure for table book_shop.supplier_payment
CREATE TABLE IF NOT EXISTS `supplier_payment` (
  `id_payment` varchar(20) NOT NULL,
  `id_supplier` varchar(15) NOT NULL,
  `date` date DEFAULT NULL,
  `value` double DEFAULT NULL,
  `payment_method` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_payment`),
  KEY `fk_payment_supplier1_idx` (`id_supplier`),
  CONSTRAINT `fk_payment_supplier1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.supplier_payment: ~12 rows (approximately)
/*!40000 ALTER TABLE `supplier_payment` DISABLE KEYS */;
INSERT INTO `supplier_payment` (`id_payment`, `id_supplier`, `date`, `value`, `payment_method`) VALUES
	('ITP0000001', 'IS000001', '2018-06-26', 708750, 'Cheque'),
	('ITP0000002', 'IS000001', '2019-06-27', 10000, 'Cash'),
	('ITP0000003', 'IS000001', '2019-06-28', 300, 'Cheque'),
	('ITP0000004', 'IS000001', '2019-06-28', 240, 'Cash'),
	('ITP0000005', 'IS000001', '2019-06-28', 240, 'Cash'),
	('ITP0000006', 'IS000001', '2019-06-28', 200, 'Cash'),
	('ITP0000007', 'IS000001', '2019-06-28', 200, 'Cash'),
	('ITP0000008', 'IS000001', '2019-06-28', 300, 'Cash'),
	('ITP0000009', 'IS000001', '2019-06-28', 100, 'Cash'),
	('ITP0000010', 'IS000001', '2019-06-29', 1000, 'Cash'),
	('ITP0000011', 'IS000001', '2019-06-29', 40, 'Cash'),
	('ITP0000012', 'IS000001', '2019-06-28', 10000, 'Cash');
/*!40000 ALTER TABLE `supplier_payment` ENABLE KEYS */;

-- Dumping structure for table book_shop.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_employee` varchar(15) DEFAULT NULL,
  `user_name` varchar(12) NOT NULL,
  `password` varchar(1024) DEFAULT NULL,
  `user_type` varchar(15) DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`,`user_name`),
  KEY `fk_user_employee1_idx` (`id_employee`),
  CONSTRAINT `fk_user_employee1` FOREIGN KEY (`id_employee`) REFERENCES `employee` (`id_employee`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- Dumping data for table book_shop.user: ~5 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `id_employee`, `user_name`, `password`, `user_type`, `state`) VALUES
	(1, '0001', 'kani', 'kani', 'Admin', 1),
	(2, '0002', 'kani1', 'viraj1', 'Manager', 1),
	(3, '0003', 'kani2', 'viraj2', 'Cashier', 1),
	(4, '0004', 'kani3', 'viraj3', 'Data Entry', 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for view book_shop.payble_payments
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `payble_payments`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `payble_payments` AS select `grn`.`grn_no` AS `grn_no`,`grn`.`id_supplier` AS `id_supplier`,`grn`.`date` AS `date`,`grn`.`value` AS `value`,`payble_grn`.`paid_amount` AS `paid_amount`,`payble_grn`.`balance` AS `balance` from (`grn` join `payble_grn` on((`grn`.`grn_no` = `payble_grn`.`grn_no`))) where (`payble_grn`.`balance` > 0);

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
