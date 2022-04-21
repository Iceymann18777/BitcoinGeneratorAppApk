package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* renamed from: j */
    static final android.graphics.PorterDuff.Mode f2623j = null;

    /* renamed from: a */
    public int f2624a;

    /* renamed from: b */
    java.lang.Object f2625b;

    /* renamed from: c */
    public byte[] f2626c;

    /* renamed from: d */
    public android.os.Parcelable f2627d;

    /* renamed from: e */
    public int f2628e;

    /* renamed from: f */
    public int f2629f;

    /* renamed from: g */
    public android.content.res.ColorStateList f2630g;

    /* renamed from: h */
    android.graphics.PorterDuff.Mode f2631h;

    /* renamed from: i */
    public java.lang.String f2632i;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.f2623j = r0
            return
    }

    public IconCompat() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2630g = r0
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f2623j
            r1.f2631h = r0
            return
    }

    /* renamed from: a */
    private static int m1612a(android.graphics.drawable.Icon r6) {
            java.lang.String r0 = "Unable to get icon resource"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x000f
            int r6 = r6.getResId()
            return r6
        L_0x000f:
            r2 = 0
            java.lang.Class r3 = r6.getClass()     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            java.lang.String r4 = "getResId"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            java.lang.Object r6 = r3.invoke(r6, r4)     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            int r6 = r6.intValue()     // Catch: NoSuchMethodException -> 0x0029, InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0033
            return r6
        L_0x0029:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L_0x002e:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L_0x0033:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
    }

    /* renamed from: a */
    private static java.lang.String m1613a(int r1) {
            r0 = 1
            if (r1 == r0) goto L_0x001e
            r0 = 2
            if (r1 == r0) goto L_0x001b
            r0 = 3
            if (r1 == r0) goto L_0x0018
            r0 = 4
            if (r1 == r0) goto L_0x0015
            r0 = 5
            if (r1 == r0) goto L_0x0012
            java.lang.String r1 = "UNKNOWN"
            return r1
        L_0x0012:
            java.lang.String r1 = "BITMAP_MASKABLE"
            return r1
        L_0x0015:
            java.lang.String r1 = "URI"
            return r1
        L_0x0018:
            java.lang.String r1 = "DATA"
            return r1
        L_0x001b:
            java.lang.String r1 = "RESOURCE"
            return r1
        L_0x001e:
            java.lang.String r1 = "BITMAP"
            return r1
    }

    /* renamed from: b */
    private static java.lang.String m1609b(android.graphics.drawable.Icon r7) {
            java.lang.String r0 = "Unable to get icon package"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x000f
            java.lang.String r7 = r7.getResPackage()
            return r7
        L_0x000f:
            r2 = 0
            java.lang.Class r3 = r7.getClass()     // Catch: NoSuchMethodException -> 0x0026, InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0030
            java.lang.String r4 = "getResPackage"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: NoSuchMethodException -> 0x0026, InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0030
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: NoSuchMethodException -> 0x0026, InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0030
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: NoSuchMethodException -> 0x0026, InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0030
            java.lang.Object r7 = r3.invoke(r7, r4)     // Catch: NoSuchMethodException -> 0x0026, InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0030
            java.lang.String r7 = (java.lang.String) r7     // Catch: NoSuchMethodException -> 0x0026, InvocationTargetException -> 0x002b, IllegalAccessException -> 0x0030
            return r7
        L_0x0026:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L_0x002b:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L_0x0030:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
    }

    /* renamed from: a */
    public int m1614a() {
            r3 = this;
            int r0 = r3.f2624a
            r1 = -1
            if (r0 != r1) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0014
            java.lang.Object r0 = r3.f2625b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r0 = m1612a(r0)
            return r0
        L_0x0014:
            int r0 = r3.f2624a
            r1 = 2
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f2628e
            return r0
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: a */
    public void m1611a(boolean r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.f2631h
            java.lang.String r0 = r0.name()
            r3.f2632i = r0
            int r0 = r3.f2624a
            r1 = -1
            if (r0 == r1) goto L_0x005f
            r1 = 1
            if (r0 == r1) goto L_0x0046
            r1 = 2
            java.lang.String r2 = "UTF-16"
            if (r0 == r1) goto L_0x0037
            r1 = 3
            if (r0 == r1) goto L_0x0030
            r1 = 4
            if (r0 == r1) goto L_0x001f
            r1 = 5
            if (r0 == r1) goto L_0x0046
            goto L_0x0067
        L_0x001f:
            java.lang.Object r4 = r3.f2625b
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r2)
            byte[] r4 = r4.getBytes(r0)
            r3.f2626c = r4
            goto L_0x0067
        L_0x0030:
            java.lang.Object r4 = r3.f2625b
            byte[] r4 = (byte[]) r4
            r3.f2626c = r4
            goto L_0x0067
        L_0x0037:
            java.lang.Object r4 = r3.f2625b
            java.lang.String r4 = (java.lang.String) r4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r2)
            byte[] r4 = r4.getBytes(r0)
            r3.f2626c = r4
            goto L_0x0067
        L_0x0046:
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r3.f2625b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 90
            r4.compress(r1, r2, r0)
            byte[] r4 = r0.toByteArray()
            r3.f2626c = r4
            goto L_0x0067
        L_0x005f:
            if (r4 != 0) goto L_0x0068
        L_0x0061:
            java.lang.Object r4 = r3.f2625b
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.f2627d = r4
        L_0x0067:
            return
        L_0x0068:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: b */
    public java.lang.String m1610b() {
            r3 = this;
            int r0 = r3.f2624a
            r1 = -1
            if (r0 != r1) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x0014
            java.lang.Object r0 = r3.f2625b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            java.lang.String r0 = m1609b(r0)
            return r0
        L_0x0014:
            int r0 = r3.f2624a
            r2 = 2
            if (r0 != r2) goto L_0x0027
            java.lang.Object r0 = r3.f2625b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2, r1)
            r1 = 0
            r0 = r0[r1]
            return r0
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public void m1608c() {
            r3 = this;
            java.lang.String r0 = r3.f2632i
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)
            r3.f2631h = r0
            int r0 = r3.f2624a
            r1 = -1
            if (r0 == r1) goto L_0x0044
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L_0x0032
            r1 = 2
            if (r0 == r1) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            r1 = 4
            if (r0 == r1) goto L_0x0022
            r1 = 5
            if (r0 == r1) goto L_0x0032
            goto L_0x004a
        L_0x001d:
            byte[] r0 = r3.f2626c
            r3.f2625b = r0
            goto L_0x004a
        L_0x0022:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.f2626c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r0.<init>(r1, r2)
            r3.f2625b = r0
            goto L_0x004a
        L_0x0032:
            android.os.Parcelable r0 = r3.f2627d
            if (r0 == 0) goto L_0x0037
            goto L_0x0048
        L_0x0037:
            byte[] r0 = r3.f2626c
            r3.f2625b = r0
            r3.f2624a = r2
            r1 = 0
            r3.f2628e = r1
            int r0 = r0.length
            r3.f2629f = r0
            goto L_0x004a
        L_0x0044:
            android.os.Parcelable r0 = r3.f2627d
            if (r0 == 0) goto L_0x004b
        L_0x0048:
            r3.f2625b = r0
        L_0x004a:
            return
        L_0x004b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f2624a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f2625b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f2624a
            java.lang.String r1 = m1613a(r1)
            r0.append(r1)
            int r1 = r4.f2624a
            r2 = 1
            if (r1 == r2) goto L_0x0077
            r3 = 2
            if (r1 == r3) goto L_0x004f
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x0077
            goto L_0x0097
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f2625b
            r0.append(r1)
            goto L_0x0097
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f2628e
            r0.append(r1)
            int r1 = r4.f2629f
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f2629f
            goto L_0x0094
        L_0x004f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.m1610b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.m1614a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0097
        L_0x0077:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f2625b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f2625b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0094:
            r0.append(r1)
        L_0x0097:
            android.content.res.ColorStateList r1 = r4.f2630g
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f2630g
            r0.append(r1)
        L_0x00a5:
            android.graphics.PorterDuff$Mode r1 = r4.f2631h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f2623j
            if (r1 == r2) goto L_0x00b5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f2631h
            r0.append(r1)
        L_0x00b5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
