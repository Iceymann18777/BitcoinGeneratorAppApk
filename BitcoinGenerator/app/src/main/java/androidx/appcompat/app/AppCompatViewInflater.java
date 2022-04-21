package androidx.appcompat.app;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private static final java.lang.String[] sClassPrefixList = null;
    private static final java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = null;
    private static final java.lang.Class<?>[] sConstructorSignature = null;
    private static final int[] sOnClickAttrs = null;
    private final java.lang.Object[] mConstructorArgs;

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    /* loaded from: classes.dex */
    private static class View$OnClickListenerC0427a implements android.view.View.OnClickListener {

        /* renamed from: b */
        private final android.view.View f1389b;

        /* renamed from: c */
        private final java.lang.String f1390c;

        /* renamed from: d */
        private java.lang.reflect.Method f1391d;

        /* renamed from: e */
        private android.content.Context f1392e;

        public View$OnClickListenerC0427a(android.view.View r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f1389b = r1
                r0.f1390c = r2
                return
        }

        /* renamed from: a */
        private void m2661a(android.content.Context r5, java.lang.String r6) {
                r4 = this;
            L_0x0000:
                if (r5 == 0) goto L_0x002f
                boolean r6 = r5.isRestricted()     // Catch: NoSuchMethodException -> 0x0021
                if (r6 != 0) goto L_0x0022
                java.lang.Class r6 = r5.getClass()     // Catch: NoSuchMethodException -> 0x0021
                java.lang.String r0 = r4.f1390c     // Catch: NoSuchMethodException -> 0x0021
                r1 = 1
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: NoSuchMethodException -> 0x0021
                r2 = 0
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r1[r2] = r3     // Catch: NoSuchMethodException -> 0x0021
                java.lang.reflect.Method r6 = r6.getMethod(r0, r1)     // Catch: NoSuchMethodException -> 0x0021
                if (r6 == 0) goto L_0x0022
                r4.f1391d = r6     // Catch: NoSuchMethodException -> 0x0021
                r4.f1392e = r5     // Catch: NoSuchMethodException -> 0x0021
                return
            L_0x0021:
            L_0x0022:
                boolean r6 = r5 instanceof android.content.ContextWrapper
                if (r6 == 0) goto L_0x002d
                android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
                android.content.Context r5 = r5.getBaseContext()
                goto L_0x0000
            L_0x002d:
                r5 = 0
                goto L_0x0000
            L_0x002f:
                android.view.View r5 = r4.f1389b
                int r5 = r5.getId()
                r6 = -1
                if (r5 != r6) goto L_0x003b
                java.lang.String r5 = ""
                goto L_0x005f
            L_0x003b:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = " with id '"
                r6.append(r0)
                android.view.View r0 = r4.f1389b
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r5 = r0.getResourceEntryName(r5)
                r6.append(r5)
                java.lang.String r5 = "'"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
            L_0x005f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Could not find method "
                r0.append(r1)
                java.lang.String r1 = r4.f1390c
                r0.append(r1)
                java.lang.String r1 = "(View) in a parent or ancestor Context for android:onClick "
                r0.append(r1)
                java.lang.String r1 = "attribute defined on view "
                r0.append(r1)
                android.view.View r1 = r4.f1389b
                java.lang.Class r1 = r1.getClass()
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                goto L_0x008f
            L_0x008e:
                throw r6
            L_0x008f:
                goto L_0x008e
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                java.lang.reflect.Method r0 = r4.f1391d
                if (r0 != 0) goto L_0x000f
                android.view.View r0 = r4.f1389b
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = r4.f1390c
                r4.m2661a(r0, r1)
            L_0x000f:
                java.lang.reflect.Method r0 = r4.f1391d     // Catch: InvocationTargetException -> 0x001d, IllegalAccessException -> 0x0026
                android.content.Context r1 = r4.f1392e     // Catch: InvocationTargetException -> 0x001d, IllegalAccessException -> 0x0026
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: InvocationTargetException -> 0x001d, IllegalAccessException -> 0x0026
                r3 = 0
                r2[r3] = r5     // Catch: InvocationTargetException -> 0x001d, IllegalAccessException -> 0x0026
                r0.invoke(r1, r2)     // Catch: InvocationTargetException -> 0x001d, IllegalAccessException -> 0x0026
                return
            L_0x001d:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute method for android:onClick"
                r0.<init>(r1, r5)
                throw r0
            L_0x0026:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute non-public method for android:onClick"
                r0.<init>(r1, r5)
                throw r0
        }
    }

    static {
            r0 = 2
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r4 = 1
            r1[r4] = r2
            androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature = r1
            int[] r1 = new int[r4]
            r2 = 16843375(0x101026f, float:2.3695304E-38)
            r1[r3] = r2
            androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs = r1
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "android.widget."
            r1[r3] = r2
            java.lang.String r2 = "android.view."
            r1[r4] = r2
            java.lang.String r2 = "android.webkit."
            r1[r0] = r2
            androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList = r1
            a.d.a r0 = new a.d.a
            r0.<init>()
            androidx.appcompat.app.AppCompatViewInflater.sConstructorMap = r0
            return
    }

    public AppCompatViewInflater() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mConstructorArgs = r0
            return
    }

    private void checkOnClickListener(android.view.View r4, android.util.AttributeSet r5) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x002d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 15
            if (r1 < r2) goto L_0x0015
            boolean r1 = p000a.p018g.p029l.C0216r.m3401t(r4)
            if (r1 != 0) goto L_0x0015
            goto L_0x002d
        L_0x0015:
            int[] r1 = androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            r0 = 0
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x002a
            androidx.appcompat.app.AppCompatViewInflater$a r1 = new androidx.appcompat.app.AppCompatViewInflater$a
            r1.<init>(r4, r0)
            r4.setOnClickListener(r1)
        L_0x002a:
            r5.recycle()
        L_0x002d:
            return
    }

    private android.view.View createViewByPrefix(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap
            java.lang.Object r0 = r0.get(r3)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 != 0) goto L_0x0036
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: Exception -> 0x0043
            if (r4 == 0) goto L_0x0020
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: Exception -> 0x0043
            r0.<init>()     // Catch: Exception -> 0x0043
            r0.append(r4)     // Catch: Exception -> 0x0043
            r0.append(r3)     // Catch: Exception -> 0x0043
            java.lang.String r4 = r0.toString()     // Catch: Exception -> 0x0043
            goto L_0x0021
        L_0x0020:
            r4 = r3
        L_0x0021:
            java.lang.Class r2 = r2.loadClass(r4)     // Catch: Exception -> 0x0043
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch: Exception -> 0x0043
            java.lang.Class<?>[] r4 = androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature     // Catch: Exception -> 0x0043
            java.lang.reflect.Constructor r0 = r2.getConstructor(r4)     // Catch: Exception -> 0x0043
            java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r2 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap     // Catch: Exception -> 0x0043
            r2.put(r3, r0)     // Catch: Exception -> 0x0043
        L_0x0036:
            r2 = 1
            r0.setAccessible(r2)     // Catch: Exception -> 0x0043
            java.lang.Object[] r2 = r1.mConstructorArgs     // Catch: Exception -> 0x0043
            java.lang.Object r2 = r0.newInstance(r2)     // Catch: Exception -> 0x0043
            android.view.View r2 = (android.view.View) r2     // Catch: Exception -> 0x0043
            return r2
        L_0x0043:
            r2 = 0
            return r2
    }

    private android.view.View createViewFromTag(android.content.Context r5, java.lang.String r6, android.util.AttributeSet r7) {
            r4 = this;
            java.lang.String r0 = "view"
            boolean r0 = r6.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r6 = "class"
            java.lang.String r6 = r7.getAttributeValue(r1, r6)
        L_0x000f:
            r0 = 1
            r2 = 0
            java.lang.Object[] r3 = r4.mConstructorArgs     // Catch: all -> 0x004e, Exception -> 0x0056
            r3[r2] = r5     // Catch: all -> 0x004e, Exception -> 0x0056
            java.lang.Object[] r3 = r4.mConstructorArgs     // Catch: all -> 0x004e, Exception -> 0x0056
            r3[r0] = r7     // Catch: all -> 0x004e, Exception -> 0x0056
            r7 = -1
            r3 = 46
            int r3 = r6.indexOf(r3)     // Catch: all -> 0x004e, Exception -> 0x0056
            if (r7 != r3) goto L_0x0043
            r7 = 0
        L_0x0023:
            java.lang.String[] r3 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList     // Catch: all -> 0x004e, Exception -> 0x0056
            int r3 = r3.length     // Catch: all -> 0x004e, Exception -> 0x0056
            if (r7 >= r3) goto L_0x003c
            java.lang.String[] r3 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList     // Catch: all -> 0x004e, Exception -> 0x0056
            r3 = r3[r7]     // Catch: all -> 0x004e, Exception -> 0x0056
            android.view.View r3 = r4.createViewByPrefix(r5, r6, r3)     // Catch: all -> 0x004e, Exception -> 0x0056
            if (r3 == 0) goto L_0x0039
            java.lang.Object[] r5 = r4.mConstructorArgs
            r5[r2] = r1
            r5[r0] = r1
            return r3
        L_0x0039:
            int r7 = r7 + 1
            goto L_0x0023
        L_0x003c:
            java.lang.Object[] r5 = r4.mConstructorArgs
            r5[r2] = r1
            r5[r0] = r1
            return r1
        L_0x0043:
            android.view.View r5 = r4.createViewByPrefix(r5, r6, r1)     // Catch: all -> 0x004e, Exception -> 0x0056
            java.lang.Object[] r6 = r4.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r5
        L_0x004e:
            r5 = move-exception
            java.lang.Object[] r6 = r4.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            throw r5
        L_0x0056:
            java.lang.Object[] r5 = r4.mConstructorArgs
            r5[r2] = r1
            r5[r0] = r1
            return r1
    }

    private static android.content.Context themifyContext(android.content.Context r2, android.util.AttributeSet r3, boolean r4, boolean r5) {
            int[] r0 = p000a.p001a.C0009j.View
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r1, r1)
            if (r4 == 0) goto L_0x0010
            int r4 = p000a.p001a.C0009j.View_android_theme
            int r4 = r3.getResourceId(r4, r1)
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            if (r5 == 0) goto L_0x0024
            if (r4 != 0) goto L_0x0024
            int r4 = p000a.p001a.C0009j.View_theme
            int r4 = r3.getResourceId(r4, r1)
            if (r4 == 0) goto L_0x0024
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r0 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r0)
        L_0x0024:
            r3.recycle()
            if (r4 == 0) goto L_0x003c
            boolean r3 = r2 instanceof p000a.p001a.p006m.C0032d
            if (r3 == 0) goto L_0x0036
            r3 = r2
            a.a.m.d r3 = (p000a.p001a.p006m.C0032d) r3
            int r3 = r3.m4175a()
            if (r3 == r4) goto L_0x003c
        L_0x0036:
            a.a.m.d r3 = new a.a.m.d
            r3.<init>(r2, r4)
            r2 = r3
        L_0x003c:
            return r2
    }

    private void verifyNotNull(android.view.View r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " asked to inflate view for <"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ">, but returned null"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    protected androidx.appcompat.widget.C0581d createAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.d r0 = new androidx.appcompat.widget.d
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0588f createButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.f r0 = new androidx.appcompat.widget.f
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0592g createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.g r0 = new androidx.appcompat.widget.g
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0595h createCheckedTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.h r0 = new androidx.appcompat.widget.h
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0614k createEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.k r0 = new androidx.appcompat.widget.k
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0618m createImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0627o createImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.o r0 = new androidx.appcompat.widget.o
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0629p createMultiAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.p r0 = new androidx.appcompat.widget.p
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0635s createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.s r0 = new androidx.appcompat.widget.s
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0637t createRatingBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.t r0 = new androidx.appcompat.widget.t
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0639u createSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.u r0 = new androidx.appcompat.widget.u
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0645w createSpinner(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.w r0 = new androidx.appcompat.widget.w
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.C0658y createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.y r0 = new androidx.appcompat.widget.y
            r0.<init>(r2, r3)
            return r0
    }

    protected android.view.View createView(android.content.Context r1, java.lang.String r2, android.util.AttributeSet r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    final android.view.View createView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            if (r5 == 0) goto L_0x0009
            if (r1 == 0) goto L_0x0009
            android.content.Context r1 = r1.getContext()
            goto L_0x000a
        L_0x0009:
            r1 = r3
        L_0x000a:
            if (r6 != 0) goto L_0x000e
            if (r7 == 0) goto L_0x0012
        L_0x000e:
            android.content.Context r1 = themifyContext(r1, r4, r6, r7)
        L_0x0012:
            if (r8 == 0) goto L_0x0018
            android.content.Context r1 = androidx.appcompat.widget.C0632q0.m1914b(r1)
        L_0x0018:
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -1946472170: goto L_0x00a1;
                case -1455429095: goto L_0x0096;
                case -1346021293: goto L_0x008b;
                case -938935918: goto L_0x0081;
                case -937446323: goto L_0x0077;
                case -658531749: goto L_0x006c;
                case -339785223: goto L_0x0062;
                case 776382189: goto L_0x0058;
                case 1125864064: goto L_0x004e;
                case 1413872058: goto L_0x0043;
                case 1601505219: goto L_0x0038;
                case 1666676343: goto L_0x002d;
                case 2001146706: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x00ab
        L_0x0022:
            java.lang.String r6 = "Button"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 2
            goto L_0x00ab
        L_0x002d:
            java.lang.String r6 = "EditText"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 3
            goto L_0x00ab
        L_0x0038:
            java.lang.String r6 = "CheckBox"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 6
            goto L_0x00ab
        L_0x0043:
            java.lang.String r6 = "AutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 9
            goto L_0x00ab
        L_0x004e:
            java.lang.String r6 = "ImageView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 1
            goto L_0x00ab
        L_0x0058:
            java.lang.String r6 = "RadioButton"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 7
            goto L_0x00ab
        L_0x0062:
            java.lang.String r6 = "Spinner"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 4
            goto L_0x00ab
        L_0x006c:
            java.lang.String r6 = "SeekBar"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 12
            goto L_0x00ab
        L_0x0077:
            java.lang.String r6 = "ImageButton"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 5
            goto L_0x00ab
        L_0x0081:
            java.lang.String r6 = "TextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 0
            goto L_0x00ab
        L_0x008b:
            java.lang.String r6 = "MultiAutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 10
            goto L_0x00ab
        L_0x0096:
            java.lang.String r6 = "CheckedTextView"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 8
            goto L_0x00ab
        L_0x00a1:
            java.lang.String r6 = "RatingBar"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00ab
            r5 = 11
        L_0x00ab:
            switch(r5) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e5;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00db;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00c2;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00b8;
                case 12: goto L_0x00b3;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            android.view.View r5 = r0.createView(r1, r2, r4)
            goto L_0x00f6
        L_0x00b3:
            androidx.appcompat.widget.u r5 = r0.createSeekBar(r1, r4)
            goto L_0x00f3
        L_0x00b8:
            androidx.appcompat.widget.t r5 = r0.createRatingBar(r1, r4)
            goto L_0x00f3
        L_0x00bd:
            androidx.appcompat.widget.p r5 = r0.createMultiAutoCompleteTextView(r1, r4)
            goto L_0x00f3
        L_0x00c2:
            androidx.appcompat.widget.d r5 = r0.createAutoCompleteTextView(r1, r4)
            goto L_0x00f3
        L_0x00c7:
            androidx.appcompat.widget.h r5 = r0.createCheckedTextView(r1, r4)
            goto L_0x00f3
        L_0x00cc:
            androidx.appcompat.widget.s r5 = r0.createRadioButton(r1, r4)
            goto L_0x00f3
        L_0x00d1:
            androidx.appcompat.widget.g r5 = r0.createCheckBox(r1, r4)
            goto L_0x00f3
        L_0x00d6:
            androidx.appcompat.widget.m r5 = r0.createImageButton(r1, r4)
            goto L_0x00f3
        L_0x00db:
            androidx.appcompat.widget.w r5 = r0.createSpinner(r1, r4)
            goto L_0x00f3
        L_0x00e0:
            androidx.appcompat.widget.k r5 = r0.createEditText(r1, r4)
            goto L_0x00f3
        L_0x00e5:
            androidx.appcompat.widget.f r5 = r0.createButton(r1, r4)
            goto L_0x00f3
        L_0x00ea:
            androidx.appcompat.widget.o r5 = r0.createImageView(r1, r4)
            goto L_0x00f3
        L_0x00ef:
            androidx.appcompat.widget.y r5 = r0.createTextView(r1, r4)
        L_0x00f3:
            r0.verifyNotNull(r5, r2)
        L_0x00f6:
            if (r5 != 0) goto L_0x00fe
            if (r3 == r1) goto L_0x00fe
            android.view.View r5 = r0.createViewFromTag(r1, r2, r4)
        L_0x00fe:
            if (r5 == 0) goto L_0x0103
            r0.checkOnClickListener(r5, r4)
        L_0x0103:
            return r5
    }
}
