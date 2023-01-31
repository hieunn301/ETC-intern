import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';

import 'components/body.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();
  runApp(SignInScreen());
}

class SignInScreen extends StatelessWidget {
  static String routeName = "/sign_in";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          "Sign In",
          style: TextStyle(
            fontSize: 24,
          ),
        ),
      ),
      body: Body(),
    );
  }
}
