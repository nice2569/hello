    public String getRecord(long result) {
        String data = null;
        SQLiteDatabase db = this.getWritableDatabase();
        String[] columns = { "_id", "name", "age"};
        Cursor c = db.query(TABLE_NAME,
                columns,
                "_id=?", new String[] { String.valueOf(result) },
                null, null, null, null);

        Log.d(TABLE_NAME,"recID "+ result + " count " + c.getCount() );

        if (c != null) {
            Log.d(TABLE_NAME,"recID "+ c);
            if (c.moveToFirst()) {
                int idCol= c.getColumnIndex("_id");
                int nameCol= c.getColumnIndex("name");
                int ageCol= c.getColumnIndex("age");
                String strId = Integer.toString(c.getInt(idCol));
                String strName = c.getString(nameCol);
                String strAge = Integer.toString(c.getInt(ageCol));
                data = strId + " "+ strName + " " + strAge + "\n";
            }
        }
        c.close();
        return data;
    }