package com.mastek.app.dao;

	import java.sql.ResultSet;
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;
	import org.springframework.stereotype.Component;

	import com.mastek.app.model.BankAccount;


	@Component
	public class BankAccountRowMapper implements RowMapper<BankAccount> {

		@Override
		public BankAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
			BankAccount account=new BankAccount();
			account.setAccno(rs.getInt("accNo"));
			account.setAccname(rs.getString("accName"));
			account.setBalance(rs.getDouble("balance"));
			return account;
		}


}
