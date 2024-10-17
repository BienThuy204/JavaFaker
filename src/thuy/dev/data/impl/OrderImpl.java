package thuy.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import thuy.dev.data.dao.OrderDao;
import thuy.dev.data.model.Order;
import thuy.dev.data.driver.MySQLDriver;
import java.util.logging.Logger;
import java.util.logging.Level;

public class OrderImpl implements OrderDao {
	
	Connection con = MySQLDriver.getInstance().getConnection();
	
}