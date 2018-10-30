package com.mahendra;

import java.sql.*;

public class CountryDAO {
    public Country findCountryById(String id){
        try {
            Connection con = ConnectionUtil.getConnection();
            PreparedStatement ps = con.prepareStatement
                    ("SELECT country_id, country_name, c.region_id, region_name from COUNTRIES c JOIN REGIONS r on(c.region_id = r.region_id) where country_id=?");
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            return parseResultSet(rs);
        }catch(ClassNotFoundException| SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }

    //Converting Result in Country object
    private Country parseResultSet(ResultSet rs)throws SQLException{
        if(!rs.next())
            return null;
        String countryId = rs.getString(1);
        String name = rs.getString(2);
        int regionId = rs.getInt(3);
        String regionName = rs.getString(4);
        Region r = new Region(regionId,regionName);
        Country c = new Country(r,countryId,name);
        return c;
    }
}
