/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kjmc20230814.accesoadatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import kjmc20230814.entidadesdenegocio.Tarea;

public class TareaDAL {
    
     static String getFields() {
        return "t.Id, t.DescripcionTarea, t.StatusTarea";
    }

    public static int addTarea(Tarea tarea) throws Exception {
        int result;
        String sql;
        try (Connection conn = ComunDB.obtenerConexion()) {
            sql = "INSERT INTO Tareas (DescripcionTarea, StatusTarea) VALUES (?, ?)";
            try (PreparedStatement ps = ComunDB.createPreparedStatement(conn, sql)) {
                ps.setString(1, tarea.getDescripcionTarea());
                ps.setBoolean(2, tarea.isStatusTarea());
                result = ps.executeUpdate();
            } catch (SQLException ex) {
                throw ex;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return result;
    }
    
    public static int deleteTarea(Tarea tarea) throws Exception {
        int result;
        String sql;
        try (Connection conn = ComunDB.obtenerConexion()) {
            sql = "DELETE FROM Tareas WHERE Id=?";
            try (PreparedStatement ps = ComunDB.createPreparedStatement(conn, sql)) {
                ps.setInt(1, tarea.getId());
                result = ps.executeUpdate();
            } catch (SQLException ex) {
                throw ex;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return result;
    }
    
    /**
     * static int assignDataResultSet(Tarea tarea, ResultSet resultSet, int index) throws Exception {
    index++;
    file.setId(resultSet.getInt(index)); // index 1
    index++;
    file.setDescripcionTarea(resultSet.getString(index)); // index 2
    index++;
    file.setStatusTarea(resultSet.getString(index)); // index 2
    return index;
}

private static void getData(PreparedStatement pPS, ArrayList<Tarea> tarea) throws Exception {
    try (ResultSet resultSet = ComunDB.obtenerResultSet(pPS)) {
        while (resultSet.next()) {
            Tarea tarea = new Tarea();
            assignDataResultSet(tarea, resultSet, 0);
            tareas.add(file);
        }
    } catch (SQLException ex) {
        throw ex;
    }
}

 public static ArrayList<Tarea> getAllFiles() throws Exception {
    ArrayList<Tarea> tareas = new ArrayList<>();
    try (Connection conn = ComunDB.obtenerConexion()) {
        String sql = "SELECT Id, NameFile, Extension,  FROM Tareas";
        try (PreparedStatement ps = ComunDB.createPreparedStatement(conn, sql)) {
            getData(ps, files);
        } catch (SQLException ex) {
            throw ex;
        }
    } catch (SQLException ex) {
        throw ex;
    }
    return tareas;
}
 
 static void querySelect(FileA file, ComunDB.UtilQuery pUtilQuery) throws SQLException {
    PreparedStatement statement = pUtilQuery.getStatement();
    if (file.getId() > 0) {
        pUtilQuery.AgregarWhereAnd(" f.Id=? ");
        if (statement != null) {
            statement.setInt(pUtilQuery.getNumWhere(), file.getId());
        }
    }
    if (file.getNameFile() != null && !file.getNameFile().trim().isEmpty()) {
        pUtilQuery.AgregarWhereAnd(" f.NameFile LIKE ? ");
        if (statement != null) {
            statement.setString(pUtilQuery.getNumWhere(), "%" + file.getNameFile() + "%");
        }
    }
    if (file.getExtension() != null && !file.getExtension().trim().isEmpty()) {
        pUtilQuery.AgregarWhereAnd(" f.Extension LIKE ? ");
        if (statement != null) {
            statement.setString(pUtilQuery.getNumWhere(), "%" + file.getExtension() + "%");
        }
    }
    if (file.getMimeType() != null && !file.getMimeType().trim().isEmpty()) {
        pUtilQuery.AgregarWhereAnd(" f.MimeType LIKE ? ");
        if (statement != null) {
            statement.setString(pUtilQuery.getNumWhere(), "%" + file.getMimeType() + "%");
        }
    }
    if (file.getCreationDate() != null) {
        pUtilQuery.AgregarWhereAnd(" f.CreationDate = ? ");
        if (statement != null) {
            statement.setDate(pUtilQuery.getNumWhere(), new java.sql.Date(file.getCreationDate().getTime()));
        }
    }
    if (file.getUrl() != null && !file.getUrl().trim().isEmpty()) {
        pUtilQuery.AgregarWhereAnd(" f.Url LIKE ? ");
        if (statement != null) {
            statement.setString(pUtilQuery.getNumWhere(), "%" + file.getUrl() + "%");
        }
    }
    if (file.getTypeStorage() != null && !file.getTypeStorage().trim().isEmpty()) {
        pUtilQuery.AgregarWhereAnd(" f.TypeStorage LIKE ? ");
        if (statement != null) {
            statement.setString(pUtilQuery.getNumWhere(), "%" + file.getTypeStorage() + "%");
        }
    }
}

public static FileA getFileById(int fileId) throws Exception {
    FileA file = null;
    try (Connection conn = ComunDB.obtenerConexion()) {
        String sql = "SELECT Id, NameFile, Extension, MimeType, CreationDate, Files, Url, TypeStorage FROM Files WHERE Id=?";
        try (PreparedStatement ps = ComunDB.createPreparedStatement(conn, sql)) {
            ps.setInt(1, fileId);
            ArrayList<FileA> files = new ArrayList<>();
            getData(ps, files);
            if (!files.isEmpty()) {
                file = files.get(0);
            }
        } catch (SQLException ex) {
            throw ex;
        }
    } catch (SQLException ex) {
        throw ex;
    }
    return file;
}

 public static int updateFile(FileA file) throws Exception {
    int result;
    String sql;
    try (Connection conn = ComunDB.obtenerConexion()) {
        sql = "UPDATE Files SET NameFile=?, Extension=?, MimeType=?, CreationDate=?, Files=?, Url=?, TypeStorage=? WHERE Id=?";
        try (PreparedStatement ps = ComunDB.createPreparedStatement(conn, sql)) {
            ps.setString(1, file.getNameFile());
            ps.setString(2, file.getExtension());
            ps.setString(3, file.getMimeType());
            ps.setDate(4, new java.sql.Date(file.getCreationDate().getTime()));
            ps.setBytes(5, file.getFiles());
            ps.setString(6, file.getUrl());
            ps.setString(7, file.getTypeStorage());
            ps.setInt(8, file.getId());
            result = ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    } catch (SQLException ex) {
        throw ex;
    }
    return result;
 }
     */
}
