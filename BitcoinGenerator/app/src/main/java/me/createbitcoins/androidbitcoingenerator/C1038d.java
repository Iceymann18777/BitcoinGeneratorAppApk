package me.createbitcoins.androidbitcoingenerator;

/* renamed from: me.createbitcoins.androidbitcoingenerator.d */
/* loaded from: classes.dex */
public class C1038d extends android.content.BroadcastReceiver {
    public C1038d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            java.lang.String r0 = r4.getAction()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            r0 = 0
            java.lang.String r1 = "noConnectivity"
            boolean r4 = r4.getBooleanExtra(r1, r0)
            if (r4 == 0) goto L_0x0022
            me.createbitcoins.androidbitcoingenerator.c r3 = me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.m8a0()
            java.lang.String r4 = "#FF0000"
            int r4 = android.graphics.Color.parseColor(r4)
            java.lang.String r0 = " Offline"
            goto L_0x0038
        L_0x0022:
            r4 = 1
            java.lang.String r0 = "Injection Service available."
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r4)
            r3.show()
            me.createbitcoins.androidbitcoingenerator.c r3 = me.createbitcoins.androidbitcoingenerator.View$OnClickListenerC1010c.m8a0()
            java.lang.String r4 = "#09FB10"
            int r4 = android.graphics.Color.parseColor(r4)
            java.lang.String r0 = " Online"
        L_0x0038:
            r3.m10a(r0, r4)
        L_0x003b:
            return
    }
}
