import 'package:flutter/material.dart';
import 'package:flutter_trello/size_config.dart';

import 'components/body.dart';

class OtpScreen extends StatelessWidget {
  static String routeName = "/otp";
  @override
  Widget build(BuildContext context) {
    SizeConfig().init(context);
    return Scaffold(
      appBar: AppBar(
        title: Text(
          "OTP Verification",
          style: TextStyle(fontSize: 24),
        ),
      ),
      body: Body(),
    );
  }
}
