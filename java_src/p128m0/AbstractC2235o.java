package p128m0;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import co.median.android.MainActivity;

/* JADX INFO: renamed from: m0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2235o {

    /* JADX INFO: renamed from: a */
    private static final String f10340a = "m0.o";

    /* JADX INFO: renamed from: b */
    private static AudioFocusRequest f10341b;

    /* JADX INFO: renamed from: c */
    private static AudioFocusRequest f10342c;

    /* JADX INFO: renamed from: d */
    private static AudioManager.OnAudioFocusChangeListener f10343d;

    /* JADX INFO: renamed from: e */
    private static AudioManager.OnAudioFocusChangeListener f10344e;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10786a(Object obj, MainActivity mainActivity, AudioManager audioManager, int i3) {
        if (i3 == -3 || i3 == -2 || i3 == -1) {
            synchronized (obj) {
                Log.d(f10340a, "AudioFocus LOST. Try to reconnect bluetooth device");
                m10790e(mainActivity, audioManager);
            }
        } else {
            if (i3 != 1) {
                return;
            }
            synchronized (obj) {
                Log.d(f10340a, "AudioFocus GAINED. Try to connect bluetooth device");
                m10790e(mainActivity, audioManager);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10787b(Object obj, MainActivity mainActivity, int i3) {
        if (i3 == 1) {
            synchronized (obj) {
                Log.d(f10340a, "AudioFocusListener GAINED. Try to request audio focus");
                m10791f(mainActivity);
                m10788c(mainActivity);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10788c(MainActivity mainActivity) {
        AudioManager audioManager = (AudioManager) mainActivity.getSystemService("audio");
        if (audioManager == null) {
            Log.w(f10340a, "AudioManager is null. Aborting abandonFocusRequest()");
        }
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = f10343d;
            if (onAudioFocusChangeListener != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                f10343d = null;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = f10344e;
            if (onAudioFocusChangeListener2 != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener2);
                f10344e = null;
                return;
            }
            return;
        }
        AudioFocusRequest audioFocusRequest = f10341b;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            f10341b = null;
        }
        AudioFocusRequest audioFocusRequest2 = f10342c;
        if (audioFocusRequest2 != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest2);
            f10342c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10789d(final MainActivity mainActivity) {
        int iRequestAudioFocus;
        final Object obj = new Object();
        AudioManager audioManager = (AudioManager) mainActivity.getSystemService("audio");
        if (audioManager == null) {
            Log.w(f10340a, "AudioManager is null. Aborting initAudioFocusListener()");
        }
        f10343d = new AudioManager.OnAudioFocusChangeListener() { // from class: m0.m
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i3) {
                AbstractC2235o.m10787b(obj, mainActivity, i3);
            }
        };
        if (Build.VERSION.SDK_INT < 26) {
            iRequestAudioFocus = audioManager.requestAudioFocus(f10343d, 0, 3);
        } else {
            AudioFocusRequest audioFocusRequestBuild = AbstractC2223k.m10784a(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(f10343d).build();
            f10341b = audioFocusRequestBuild;
            iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
        }
        synchronized (obj) {
            if (iRequestAudioFocus == 1) {
                try {
                    Log.d(f10340a, "AudioFocusListener REQUEST GRANTED");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m10790e(MainActivity mainActivity, AudioManager audioManager) {
        if (!audioManager.isBluetoothScoAvailableOffCall() || audioManager.isBluetoothScoOn()) {
            return;
        }
        Log.d(f10340a, "Resetting audio to bluetooth device");
        m10792g(mainActivity, 2);
    }

    /* JADX INFO: renamed from: f */
    public static void m10791f(final MainActivity mainActivity) {
        int iRequestAudioFocus;
        final Object obj = new Object();
        final AudioManager audioManager = (AudioManager) mainActivity.getSystemService("audio");
        if (audioManager == null) {
            Log.w(f10340a, "AudioManager is null. Aborting requestAudioFocus()");
        }
        f10344e = new AudioManager.OnAudioFocusChangeListener() { // from class: m0.n
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i3) {
                AbstractC2235o.m10786a(obj, mainActivity, audioManager, i3);
            }
        };
        m10788c(mainActivity);
        if (Build.VERSION.SDK_INT < 26) {
            iRequestAudioFocus = audioManager.requestAudioFocus(f10344e, 0, 3);
        } else {
            AudioFocusRequest audioFocusRequestBuild = AbstractC2223k.m10784a(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(f10344e).build();
            f10342c = audioFocusRequestBuild;
            iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
        }
        synchronized (obj) {
            if (iRequestAudioFocus == 1) {
                try {
                    Log.d(f10340a, "AudioFocus REQUEST GRANTED");
                    m10790e(mainActivity, audioManager);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m10792g(MainActivity mainActivity, int i3) {
        AudioManager audioManager = (AudioManager) mainActivity.getSystemService("audio");
        if (i3 == 2) {
            audioManager.setMode(3);
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
        } else {
            if (i3 == 1) {
                audioManager.setMode(3);
                audioManager.stopBluetoothSco();
                audioManager.setBluetoothScoOn(false);
                audioManager.setSpeakerphoneOn(false);
                return;
            }
            audioManager.setMode(0);
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(true);
        }
    }
}
