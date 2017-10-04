package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class ProfesoresEntidadRealmProxy extends com.plug.eulerattendance.entidades.ProfesoresEntidad
    implements RealmObjectProxy, ProfesoresEntidadRealmProxyInterface {

    static final class ProfesoresEntidadColumnInfo extends ColumnInfo {
        long idIndex;
        long NombreIndex;
        long DiaIndex;
        long FechaExactaIndex;
        long HoraIndex;

        ProfesoresEntidadColumnInfo(SharedRealm realm, Table table) {
            super(5);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.NombreIndex = addColumnDetails(table, "Nombre", RealmFieldType.STRING);
            this.DiaIndex = addColumnDetails(table, "Dia", RealmFieldType.STRING);
            this.FechaExactaIndex = addColumnDetails(table, "FechaExacta", RealmFieldType.STRING);
            this.HoraIndex = addColumnDetails(table, "Hora", RealmFieldType.STRING);
        }

        ProfesoresEntidadColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ProfesoresEntidadColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ProfesoresEntidadColumnInfo src = (ProfesoresEntidadColumnInfo) rawSrc;
            final ProfesoresEntidadColumnInfo dst = (ProfesoresEntidadColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.NombreIndex = src.NombreIndex;
            dst.DiaIndex = src.DiaIndex;
            dst.FechaExactaIndex = src.FechaExactaIndex;
            dst.HoraIndex = src.HoraIndex;
        }
    }

    private ProfesoresEntidadColumnInfo columnInfo;
    private ProxyState<com.plug.eulerattendance.entidades.ProfesoresEntidad> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("Nombre");
        fieldNames.add("Dia");
        fieldNames.add("FechaExacta");
        fieldNames.add("Hora");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ProfesoresEntidadRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ProfesoresEntidadColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.plug.eulerattendance.entidades.ProfesoresEntidad>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$Nombre() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.NombreIndex);
    }

    @Override
    public void realmSet$Nombre(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.NombreIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.NombreIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.NombreIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.NombreIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$Dia() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.DiaIndex);
    }

    @Override
    public void realmSet$Dia(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.DiaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.DiaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.DiaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.DiaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$FechaExacta() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.FechaExactaIndex);
    }

    @Override
    public void realmSet$FechaExacta(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.FechaExactaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.FechaExactaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.FechaExactaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.FechaExactaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$Hora() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.HoraIndex);
    }

    @Override
    public void realmSet$Hora(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.HoraIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.HoraIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.HoraIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.HoraIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ProfesoresEntidad");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addProperty("Nombre", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("Dia", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("FechaExacta", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("Hora", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static ProfesoresEntidadColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_ProfesoresEntidad")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ProfesoresEntidad' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_ProfesoresEntidad");
        final long columnCount = table.getColumnCount();
        if (columnCount != 5) {
            if (columnCount < 5) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 5 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 5 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 5 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final ProfesoresEntidadColumnInfo columnInfo = new ProfesoresEntidadColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'id' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.idIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field id");
            }
        }

        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'long' for field 'id' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'id' does support null values in the existing Realm file. Use corresponding boxed type for field 'id' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("Nombre")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'Nombre' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("Nombre") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'Nombre' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.NombreIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'Nombre' is required. Either set @Required to field 'Nombre' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("Dia")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'Dia' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("Dia") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'Dia' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.DiaIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'Dia' is required. Either set @Required to field 'Dia' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("FechaExacta")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'FechaExacta' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("FechaExacta") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'FechaExacta' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.FechaExactaIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'FechaExacta' is required. Either set @Required to field 'FechaExacta' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("Hora")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'Hora' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("Hora") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'Hora' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.HoraIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'Hora' is required. Either set @Required to field 'Hora' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_ProfesoresEntidad";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.plug.eulerattendance.entidades.ProfesoresEntidad createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.plug.eulerattendance.entidades.ProfesoresEntidad obj = null;
        if (update) {
            Table table = realm.getTable(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.plug.eulerattendance.entidades.ProfesoresEntidad.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ProfesoresEntidadRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.ProfesoresEntidadRealmProxy) realm.createObjectInternal(com.plug.eulerattendance.entidades.ProfesoresEntidad.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ProfesoresEntidadRealmProxy) realm.createObjectInternal(com.plug.eulerattendance.entidades.ProfesoresEntidad.class, json.getLong("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("Nombre")) {
            if (json.isNull("Nombre")) {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Nombre(null);
            } else {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Nombre((String) json.getString("Nombre"));
            }
        }
        if (json.has("Dia")) {
            if (json.isNull("Dia")) {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Dia(null);
            } else {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Dia((String) json.getString("Dia"));
            }
        }
        if (json.has("FechaExacta")) {
            if (json.isNull("FechaExacta")) {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$FechaExacta(null);
            } else {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$FechaExacta((String) json.getString("FechaExacta"));
            }
        }
        if (json.has("Hora")) {
            if (json.isNull("Hora")) {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Hora(null);
            } else {
                ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Hora((String) json.getString("Hora"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.plug.eulerattendance.entidades.ProfesoresEntidad createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.plug.eulerattendance.entidades.ProfesoresEntidad obj = new com.plug.eulerattendance.entidades.ProfesoresEntidad();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$id((long) reader.nextLong());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("Nombre")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Nombre(null);
                } else {
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Nombre((String) reader.nextString());
                }
            } else if (name.equals("Dia")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Dia(null);
                } else {
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Dia((String) reader.nextString());
                }
            } else if (name.equals("FechaExacta")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$FechaExacta(null);
                } else {
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$FechaExacta((String) reader.nextString());
                }
            } else if (name.equals("Hora")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Hora(null);
                } else {
                    ((ProfesoresEntidadRealmProxyInterface) obj).realmSet$Hora((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static com.plug.eulerattendance.entidades.ProfesoresEntidad copyOrUpdate(Realm realm, com.plug.eulerattendance.entidades.ProfesoresEntidad object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.plug.eulerattendance.entidades.ProfesoresEntidad) cachedRealmObject;
        }

        com.plug.eulerattendance.entidades.ProfesoresEntidad realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = table.findFirstLong(pkColumnIndex, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.plug.eulerattendance.entidades.ProfesoresEntidad.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.ProfesoresEntidadRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            } else {
                canUpdate = false;
            }
        }

        if (canUpdate) {
            return update(realm, realmObject, object, cache);
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static com.plug.eulerattendance.entidades.ProfesoresEntidad copy(Realm realm, com.plug.eulerattendance.entidades.ProfesoresEntidad newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.plug.eulerattendance.entidades.ProfesoresEntidad) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.plug.eulerattendance.entidades.ProfesoresEntidad realmObject = realm.createObjectInternal(com.plug.eulerattendance.entidades.ProfesoresEntidad.class, ((ProfesoresEntidadRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ProfesoresEntidadRealmProxyInterface realmObjectSource = (ProfesoresEntidadRealmProxyInterface) newObject;
        ProfesoresEntidadRealmProxyInterface realmObjectCopy = (ProfesoresEntidadRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$Nombre(realmObjectSource.realmGet$Nombre());
        realmObjectCopy.realmSet$Dia(realmObjectSource.realmGet$Dia());
        realmObjectCopy.realmSet$FechaExacta(realmObjectSource.realmGet$FechaExacta());
        realmObjectCopy.realmSet$Hora(realmObjectSource.realmGet$Hora());
        return realmObject;
    }

    public static long insert(Realm realm, com.plug.eulerattendance.entidades.ProfesoresEntidad object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long tableNativePtr = table.getNativePtr();
        ProfesoresEntidadColumnInfo columnInfo = (ProfesoresEntidadColumnInfo) realm.schema.getColumnInfo(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$Nombre = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Nombre();
        if (realmGet$Nombre != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.NombreIndex, rowIndex, realmGet$Nombre, false);
        }
        String realmGet$Dia = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Dia();
        if (realmGet$Dia != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DiaIndex, rowIndex, realmGet$Dia, false);
        }
        String realmGet$FechaExacta = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$FechaExacta();
        if (realmGet$FechaExacta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.FechaExactaIndex, rowIndex, realmGet$FechaExacta, false);
        }
        String realmGet$Hora = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Hora();
        if (realmGet$Hora != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.HoraIndex, rowIndex, realmGet$Hora, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long tableNativePtr = table.getNativePtr();
        ProfesoresEntidadColumnInfo columnInfo = (ProfesoresEntidadColumnInfo) realm.schema.getColumnInfo(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.plug.eulerattendance.entidades.ProfesoresEntidad object = null;
        while (objects.hasNext()) {
            object = (com.plug.eulerattendance.entidades.ProfesoresEntidad) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$Nombre = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Nombre();
            if (realmGet$Nombre != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.NombreIndex, rowIndex, realmGet$Nombre, false);
            }
            String realmGet$Dia = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Dia();
            if (realmGet$Dia != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DiaIndex, rowIndex, realmGet$Dia, false);
            }
            String realmGet$FechaExacta = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$FechaExacta();
            if (realmGet$FechaExacta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.FechaExactaIndex, rowIndex, realmGet$FechaExacta, false);
            }
            String realmGet$Hora = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Hora();
            if (realmGet$Hora != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.HoraIndex, rowIndex, realmGet$Hora, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.plug.eulerattendance.entidades.ProfesoresEntidad object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long tableNativePtr = table.getNativePtr();
        ProfesoresEntidadColumnInfo columnInfo = (ProfesoresEntidadColumnInfo) realm.schema.getColumnInfo(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$Nombre = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Nombre();
        if (realmGet$Nombre != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.NombreIndex, rowIndex, realmGet$Nombre, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.NombreIndex, rowIndex, false);
        }
        String realmGet$Dia = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Dia();
        if (realmGet$Dia != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DiaIndex, rowIndex, realmGet$Dia, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.DiaIndex, rowIndex, false);
        }
        String realmGet$FechaExacta = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$FechaExacta();
        if (realmGet$FechaExacta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.FechaExactaIndex, rowIndex, realmGet$FechaExacta, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.FechaExactaIndex, rowIndex, false);
        }
        String realmGet$Hora = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Hora();
        if (realmGet$Hora != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.HoraIndex, rowIndex, realmGet$Hora, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.HoraIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long tableNativePtr = table.getNativePtr();
        ProfesoresEntidadColumnInfo columnInfo = (ProfesoresEntidadColumnInfo) realm.schema.getColumnInfo(com.plug.eulerattendance.entidades.ProfesoresEntidad.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.plug.eulerattendance.entidades.ProfesoresEntidad object = null;
        while (objects.hasNext()) {
            object = (com.plug.eulerattendance.entidades.ProfesoresEntidad) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfesoresEntidadRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$Nombre = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Nombre();
            if (realmGet$Nombre != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.NombreIndex, rowIndex, realmGet$Nombre, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.NombreIndex, rowIndex, false);
            }
            String realmGet$Dia = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Dia();
            if (realmGet$Dia != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DiaIndex, rowIndex, realmGet$Dia, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.DiaIndex, rowIndex, false);
            }
            String realmGet$FechaExacta = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$FechaExacta();
            if (realmGet$FechaExacta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.FechaExactaIndex, rowIndex, realmGet$FechaExacta, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.FechaExactaIndex, rowIndex, false);
            }
            String realmGet$Hora = ((ProfesoresEntidadRealmProxyInterface) object).realmGet$Hora();
            if (realmGet$Hora != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.HoraIndex, rowIndex, realmGet$Hora, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.HoraIndex, rowIndex, false);
            }
        }
    }

    public static com.plug.eulerattendance.entidades.ProfesoresEntidad createDetachedCopy(com.plug.eulerattendance.entidades.ProfesoresEntidad realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.plug.eulerattendance.entidades.ProfesoresEntidad unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.plug.eulerattendance.entidades.ProfesoresEntidad();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.plug.eulerattendance.entidades.ProfesoresEntidad) cachedObject.object;
            }
            unmanagedObject = (com.plug.eulerattendance.entidades.ProfesoresEntidad) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ProfesoresEntidadRealmProxyInterface unmanagedCopy = (ProfesoresEntidadRealmProxyInterface) unmanagedObject;
        ProfesoresEntidadRealmProxyInterface realmSource = (ProfesoresEntidadRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$Nombre(realmSource.realmGet$Nombre());
        unmanagedCopy.realmSet$Dia(realmSource.realmGet$Dia());
        unmanagedCopy.realmSet$FechaExacta(realmSource.realmGet$FechaExacta());
        unmanagedCopy.realmSet$Hora(realmSource.realmGet$Hora());
        return unmanagedObject;
    }

    static com.plug.eulerattendance.entidades.ProfesoresEntidad update(Realm realm, com.plug.eulerattendance.entidades.ProfesoresEntidad realmObject, com.plug.eulerattendance.entidades.ProfesoresEntidad newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ProfesoresEntidadRealmProxyInterface realmObjectTarget = (ProfesoresEntidadRealmProxyInterface) realmObject;
        ProfesoresEntidadRealmProxyInterface realmObjectSource = (ProfesoresEntidadRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$Nombre(realmObjectSource.realmGet$Nombre());
        realmObjectTarget.realmSet$Dia(realmObjectSource.realmGet$Dia());
        realmObjectTarget.realmSet$FechaExacta(realmObjectSource.realmGet$FechaExacta());
        realmObjectTarget.realmSet$Hora(realmObjectSource.realmGet$Hora());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ProfesoresEntidad = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Nombre:");
        stringBuilder.append(realmGet$Nombre() != null ? realmGet$Nombre() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Dia:");
        stringBuilder.append(realmGet$Dia() != null ? realmGet$Dia() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{FechaExacta:");
        stringBuilder.append(realmGet$FechaExacta() != null ? realmGet$FechaExacta() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Hora:");
        stringBuilder.append(realmGet$Hora() != null ? realmGet$Hora() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfesoresEntidadRealmProxy aProfesoresEntidad = (ProfesoresEntidadRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aProfesoresEntidad.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aProfesoresEntidad.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aProfesoresEntidad.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
