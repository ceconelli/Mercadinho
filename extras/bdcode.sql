-- MySQL Script generated by MySQL Workbench
-- 11/16/17 15:40:36
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Estado` (
  `idEstado` INT NOT NULL AUTO_INCREMENT,
  `UF` VARCHAR(45) NULL,
  `nomeEstado` VARCHAR(45) NULL,
  PRIMARY KEY (`idEstado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Producer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Producer` (
  `idProducer` INT NOT NULL AUTO_INCREMENT,
  `nameProducer` VARCHAR(200) NOT NULL,
  `CPFProducer` VARCHAR(45) NULL,
  `cashProducer` DECIMAL(15,2) NULL,
  PRIMARY KEY (`idProducer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Product` (
  `idProduct` INT NOT NULL AUTO_INCREMENT,
  `nameProduct` VARCHAR(20) NULL,
  `amountProduct` DECIMAL(15,2) NULL,
  `priceProduct` DECIMAL(15,2) NULL,
  `Producer_idProducer` INT NULL,
  PRIMARY KEY (`idProduct`),
  INDEX `fk_Product_Producer_idx` (`Producer_idProducer` ASC),
  CONSTRAINT `fk_Product_Producer`
    FOREIGN KEY (`Producer_idProducer`)
    REFERENCES `mydb`.`Producer` (`idProducer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Sale`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Sale` (
  `idSale` INT NOT NULL AUTO_INCREMENT,
  `amountSale` DECIMAL(15,2) NULL,
  `soldatSale` DATE NULL,
  PRIMARY KEY (`idSale`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Sale_Product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Sale_Product` (
  `Sale_idSale` INT NOT NULL,
  `Product_idProduct` INT NOT NULL,
  PRIMARY KEY (`Sale_idSale`, `Product_idProduct`),
  INDEX `fk_Sale_has_Product_Product1_idx` (`Product_idProduct` ASC),
  INDEX `fk_Sale_has_Product_Sale1_idx` (`Sale_idSale` ASC),
  CONSTRAINT `fk_Sale_has_Product_Sale1`
    FOREIGN KEY (`Sale_idSale`)
    REFERENCES `mydb`.`Sale` (`idSale`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sale_has_Product_Product1`
    FOREIGN KEY (`Product_idProduct`)
    REFERENCES `mydb`.`Product` (`idProduct`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
