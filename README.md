# PasscodeView-Demo
Passcode view example

## Include dependencies: 

Include dependencies in gradle app level.

```
implementation 'com.hanks:passcodeview:0.1.2'
```
Also, you need to include legacy support-v4 in gradle app level

```
dependencies {

    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    ...
    ...

    implementation 'com.hanks:passcodeview:0.1.2'
}
```
XML file:
```
<com.hanks.passcodeview.PasscodeView
    android:id="@+id/passcodeView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#222222"
    app:firstInputTip="Enter a passcode of 5 digits "
    app:correctStateColor="#71bb4d"
    app:wrongStateColor="#ea2b46"
    app:normalStateColor="#ffffff"
    app:numberTextColor="#222222"
    app:passcodeLength="5"
    app:passcodeViewType="set_passcode"/>
```

### Checking code for details.

## Visual result:
<p align = "center">
<img src="/images/01.png" width="200"> <img src="/images/02.png" width="200"> <img src="/images/03.png" width="200"> <img src="/images/04.png" width="200">
</p>
